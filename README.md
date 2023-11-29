# Balanced Bracket 

## Time Complexity:
- Perulangan setiap karakter dalam string input memerlukan time complexity O(n), di mana n adalah panjang string.
- Operasi push dan pop pada stack memiliki time complexity konstan O(1).
- Oleh karena itu, time complexity keseluruhan adalah O(n).

## Space Complexity:
- Penggunaan stack membutuhkan ruang penyimpanan yang sebanding dengan jumlah bracket.
- Pada kasus terburuk, tumpukan dapat memiliki ukuran hingga n (misalnya, semua bukaan tanpa penutupan). Pada kasus ini semua karakter akan di-push/disimpan.
- Sehingga, space complexity dari algoritma balance bracket yang dibuat adalah O(n).
