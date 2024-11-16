package com.example.roomcronoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.roomcronoapp.viewModels.CronometroViewModel
import com.example.roomcronoapp.viewModels.CronosViewModel
import com.example.roomcronoapp.views.AddView
import com.example.roomcronoapp.views.EditView
import com.example.roomcronoapp.views.HomeView

val cronosVM: CronosViewModel = TODO()

@Composable
fun NavManager(cronometroVM: CronometroViewModel, navController: NavHostController){

    NavHost(navController = navController, startDestination = "Home"){
        composable("Home"){
            HomeView(navController, cronosVM)
        }
        composable("AddView"){
            AddView(navController, cronometroVM, cronosVM)
        }
        composable("EditView/{id}", arguments = listOf(
            navArgument("id") { type = NavType.LongType }
        )){
            val id = it.arguments?.getLong("id") ?: 0
            val cronosVM = null
            EditView(navController, cronometroVM, cronosVM ,id)
        }
    }
}