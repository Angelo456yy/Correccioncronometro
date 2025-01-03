package com.example.roomcronoapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavType
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.roomcronoapp.viewModels.CronosViewModel
import com.example.roomcronoapp.views.AddView
import com.example.roomcronoapp.views.EditView
import com.example.roomcronoapp.views.HomeView

val cronosVM: CronosViewModel = TODO()

@Composable
fun NavManager(cronometroVM: Unit, navController: NavController){

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

fun EditView(navController: NavController, cronometroVM: Unit, cronVM: Nothing?, id: Long) {
    TODO("Not yet implemented")
}

fun NavHost(
    navController: NavController,
    startDestination: String,
    builder: NavGraphBuilder.() -> Unit
) {
    TODO("Not yet implemented")
}
