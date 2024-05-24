package com.example.recyclerviewjetpackcompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BlogCategory(imgId: Int, title: String, subtitle: String) {

    Card(modifier = Modifier.padding(8.dp), elevation = CardDefaults.cardElevation(8.dp)) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(id = imgId),
                contentDescription = "Null",
                modifier = Modifier
                    .size(48.dp)
                    .padding(8.dp)
                    .weight(.2f)
            )
            ItemDescription(title, subtitle, Modifier.weight(.8f))
        }
    }
}

@Composable
private fun ItemDescription(title: String, subtitle: String, modifier: Modifier) {
    Column(modifier = modifier) {

        Text(
            text = title,
            style = MaterialTheme.typography.titleMedium
        )
        Text(
            text = subtitle,
            style = MaterialTheme.typography.titleSmall,
            fontSize = 12.sp
        )
    }
}

data class Category(val imgId: Int, val title: String, val subtitle: String)

fun getCategoryList(): MutableList<Category> {
    val list = mutableListOf<Category>()
    list.add(
        Category(
            imgId = R.drawable.img_profile,
            title = "Programming1",
            subtitle = "Learn Different Languages1"
        )
    )
    list.add(
        Category(
            imgId = R.drawable.img_profile,
            title = "Programming2",
            subtitle = "Learn Different Languages2"
        )
    )
    list.add(
        Category(
            imgId = R.drawable.img_profile,
            title = "Programming3",
            subtitle = "Learn Different Languages3"
        )
    )
    list.add(
        Category(
            imgId = R.drawable.img_profile,
            title = "Programming4",
            subtitle = "Learn Different Languages4"
        )
    )
    list.add(
        Category(
            imgId = R.drawable.img_profile,
            title = "Programming5",
            subtitle = "Learn Different Languages5"
        )
    )


    return list

}

@Composable
@Preview
fun PreviewItem() {
//    Column (modifier = Modifier.verticalScroll(rememberScrollState())){
//        getCategoryList().map { item ->
//            BlogCategory(
//                imgId = item.imgId,
//                title = item.title,
//                subtitle = item.subtitle
//            )        }
//    }

    //alternative for recyclerview

    LazyColumn {
        items(getCategoryList()) { item ->
            BlogCategory(
                imgId = item.imgId,
                title = item.title,
                subtitle = item.subtitle
            )
        }
    }
}

@Composable
@Preview
fun BlogCategoryPreview() {
    BlogCategory(
        imgId = R.drawable.img_profile,
        title = "Programming",
        subtitle = "Learn Different Languages"
    )
}