package com.example.eclipsify.authentication

import com.google.firebase.auth.FirebaseAuth
import kotlinx.coroutines.tasks.await

class AuthManager {
    private val auth = FirebaseAuth.getInstance()

    suspend fun signInWithEmailAndPassword(email: String, password: String): Boolean {
        return try {
            auth.signInWithEmailAndPassword(email, password).await()
            true
        } catch (e: Exception) {
            false
        }
    }
}
