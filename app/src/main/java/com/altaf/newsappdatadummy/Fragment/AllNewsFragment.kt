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
import com.altaf.newsappdatadummy.databinding.RowItemNewsBinding


class AllNewsFragment : Fragment() {


    private lateinit var binding: FragmentAllNewsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAllNewsBinding.inflate(inflater,container, false)
        binding.rvAllNews.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = NewsAdapter(DataNews.dataAllNews)
        }

        bindingNewsHeadline(binding.newsHeadline, position = 0)

        return binding.root
    }

}