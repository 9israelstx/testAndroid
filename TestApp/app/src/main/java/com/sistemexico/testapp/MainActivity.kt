package com.sistemexico.testapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.snackbar.Snackbar
import com.google.gson.Gson
import com.sistemexico.schoolmanageralumntutor.infraestructure.configuration.error.ErrorCode
import com.sistemexico.testapp.adapter.ListUserAdapter
import com.sistemexico.testapp.databinding.ActivityMainBinding
import com.sistemexico.testapp.services.client.KtorClient
import com.sistemexico.testapp.services.response.BaseResponse
import com.sistemexico.testapp.services.response.UserResponse
import com.sistemexico.testapp.services.serviceApi.UserService
import io.ktor.http.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity(),ListUserAdapter.OnItemCLickListener,View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private var userService = UserService(this)
    private var gson = Gson()
    private lateinit var adapter : ListUserAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        findUserSerives()
    }

    fun findUserSerives() {
        lifecycleScope.launch{
            try {
                val response = withContext(Dispatchers.IO){
                    userService.findUser("https://reqres.in/api/users?page=1&per_page=10")
                }
                val data = gson.fromJson(response.result, BaseResponse::class.java)
                if (response.status == HttpStatusCode.OK) {
                    var records = data.data as MutableList<UserResponse>
                    var recordsJson = gson.toJson(records)
                    var result = gson.fromJson(recordsJson, Array<UserResponse>::class.java)
                    loadAdapter(result.toMutableList())
                }
            }catch (ex:Exception){
            }finally {
            }
        }
    }


    private fun loadAdapter(list : MutableList<UserResponse>){
        adapter = ListUserAdapter(list,this)
        binding.rvList.layoutManager = LinearLayoutManager(binding.root.context)
        binding.rvList.adapter = adapter
    }
    override fun onItemClick(v: View, position: Int, data: UserResponse) {
    }

    override fun onClick(v: View?) {

    }


}