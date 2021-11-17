package com.altaf.newsappdatadummy

import android.content.Intent
import com.altaf.newsappdatadummy.databinding.NewsHeadlineBinding

fun bindingNewsHeadline(binding: NewsHeadlineBinding,position : Int) {
    binding.apply {
        imgHeadline.setImageResource(DataNews.photoHeadline[0])
        tvTitleHeadline.text = DataNews.titleHeadline[0]
        tvDescHeadline.text = DataNews.contentHeadline[0]
        tvDateHeadline.text = DataNews.dateHeadline[0]
        tvAuthorHeadline.text = DataNews.authorHeadline[0]
    }

    binding.root.setOnClickListener{
        val intentToDetail = Intent(binding.root.context, DetailActiviy::class.java)
        intentToDetail.putExtra(DetailActiviy.EXTRA_TITLE_HEADLINE, DataNews.titleHeadline[position])
        intentToDetail.putExtra(DetailActiviy.EXTRA_IMG_HEADLINE, DataNews.photoHeadline[position])
        intentToDetail.putExtra(DetailActiviy.EXTRA_CONTENT_HEADLINE, DataNews.contentHeadline[position])
        intentToDetail.putExtra(DetailActiviy.EXTRA_DATE_HEADLINE, DataNews.dateHeadline[position])
        intentToDetail.putExtra(DetailActiviy.EXTRA_AUTHOR_HEADLINE, DataNews.authorHeadline[position])
        binding.root.context.startActivity(intentToDetail)
    }
}