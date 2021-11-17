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
import com.altaf.newsappdatadummy.databinding.FragmentTopBinding


class TopFragment : Fragment() {

    private lateinit var binding: FragmentTopBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentTopBinding.inflate(inflater,container, false)
        binding.rvTopNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataTopNews)
        }

        bindingNewsHeadline(binding.newsHeadline,position = 2)

        return binding.root
    }

}