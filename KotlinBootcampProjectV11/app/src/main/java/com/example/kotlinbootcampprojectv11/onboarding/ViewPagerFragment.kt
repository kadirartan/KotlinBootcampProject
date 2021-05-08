package com.example.kotlinbootcampprojectv11.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kotlinbootcampprojectv11.R
import com.example.kotlinbootcampprojectv11.onboarding.screens.FirstScreen
import com.example.kotlinbootcampprojectv11.onboarding.screens.SecondScreen

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        //view.viewPager.adapter = adapter

        return view
    }
}