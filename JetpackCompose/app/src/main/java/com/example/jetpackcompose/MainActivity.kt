package com.example.myjetpackcomposeapp // Thay đổi tên gói của bạn nếu khác

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myjetpackcomposeapp.ui.theme.MyJetpackComposeAppTheme // Thay đổi tên theme nếu khác

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Áp dụng chủ đề của ứng dụng.
            // Tên của chủ đề (MyJetpackComposeAppTheme) có thể khác tùy thuộc vào tên project của bạn.
            MyJetpackComposeAppTheme {
                // Surface là một vùng chứa cơ bản sử dụng màu nền của chủ đề.
                Surface(
                    modifier = Modifier.fillMaxSize(), // Chiếm toàn bộ màn hình
                    color = MaterialTheme.colorScheme.background // Sử dụng màu nền mặc định của Material Design
                ) {
                    // Gọi Composable chính để hiển thị giao diện Jetpack Compose
                    JetpackComposeWelcomeScreen()
                }
            }
        }
    }
}

@Composable
fun JetpackComposeWelcomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Chiếm toàn bộ chiều rộng và chiều cao
            .padding(24.dp), // Thêm padding xung quanh
        horizontalAlignment = Alignment.CenterHorizontally, // Căn giữa theo chiều ngang
        verticalArrangement = Arrangement.Center // Căn giữa theo chiều dọc
    ) {
        // Logo Jetpack Compose
        // Bạn cần thay thế R.drawable.ic_launcher_foreground bằng ID tài nguyên của logo Jetpack Compose thực tế của bạn
        // Ví dụ: R.drawable.jetpack_compose_logo (nếu bạn đã thêm hình ảnh logo)
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground), // Sử dụng tạm biểu tượng launcher mặc định
            contentDescription = "Jetpack Compose Logo", // Mô tả nội dung hình ảnh cho khả năng tiếp cận
            modifier = Modifier.size(200.dp) // Kích thước của logo
        )

        Spacer(modifier = Modifier.height(32.dp)) // Khoảng cách giữa logo và tiêu đề

        // Tiêu đề "Jetpack Compose"
        Text(
            text = "Jetpack Compose",
            fontSize = 28.sp, // Cỡ chữ lớn
            fontWeight = FontWeight.Bold, // Chữ in đậm
            color = MaterialTheme.colorScheme.onSurface // Màu chữ theo chủ đề
        )

        Spacer(modifier = Modifier.height(16.dp)) // Khoảng cách giữa tiêu đề và mô tả

        // Mô tả về Jetpack Compose
        Text(
            text = "Jetpack Compose is a modern UI toolkit for building native Android applications using a declarative programming approach.",
            textAlign = TextAlign.Center, // Căn giữa văn bản
            style = MaterialTheme.typography.bodyLarge, // Kiểu chữ body large
            color = MaterialTheme.colorScheme.onSurfaceVariant, // Màu chữ phụ
            modifier = Modifier.padding(horizontal = 16.dp) // Padding hai bên cho đoạn văn bản
        )

        Spacer(modifier = Modifier.height(64.dp)) // Khoảng cách lớn giữa mô tả và nút

        // Nút "I'm ready"
        Button(
            onClick = {
                // TODO: Thêm hành động khi nút "I'm ready" được nhấn
                // Ví dụ: hiển thị một Toast message, chuyển sang màn hình khác, v.v.
                // Để hiển thị Toast, bạn sẽ cần một Context:
                // val context = LocalContext.current
                // Toast.makeText(context, "You clicked I'm ready!", Toast.LENGTH_SHORT).show()
            },
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp),
            colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary) // Màu nền của nút
        ) {
            Text(
                text = "I'm ready",
                fontSize = 18.sp, // Cỡ chữ của nút
                color = MaterialTheme.colorScheme.onPrimary // Màu chữ của nút
            )
        }
    }
}

@Preview(showBackground = true, widthDp = 320)
@Composable
fun JetpackComposeWelcomeScreenPreview() {
    // Để xem trước giao diện trong Android Studio, bạn cũng cần áp dụng theme
    MyJetpackComposeAppTheme {
        JetpackComposeWelcomeScreen()
    }
}