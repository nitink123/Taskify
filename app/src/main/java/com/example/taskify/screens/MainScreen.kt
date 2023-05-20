package com.example.taskify.screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.taskify.dataBase.TaskHolder

@Composable
fun showList(data : List<TaskHolder>){
     LazyColumn(content = {
         items(data){
             //
         }
     })
}
