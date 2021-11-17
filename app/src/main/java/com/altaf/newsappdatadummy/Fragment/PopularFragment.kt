package com.altaf.newsappdatadummy.Fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.altaf.newsappdatadummy.DataNews
import com.altaf.newsappdatadummy.NewsAdapter
import com.altaf.newsappdatadummy.R
import com.altaf.newsappdatadummy.bindingNewsHeadline
import com.altaf.newsappdatadummy.databinding.FragmentAllNewsBinding
import com.altaf.newsappdatadummy.databinding.FragmentPopularBinding


class PopularFragment : Fragment() {

    private lateinit var binding: FragmentPopularBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPopularBinding.inflate(inflater,container, false)
        binding.rvPopularNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataPopularNews)
        }

        bindingNewsHeadline(binding.newsHeadline,position = 1)

        return binding.root
    }

}