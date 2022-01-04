package com.example.recycle0104.models

import java.text.NumberFormat

class RoomData (
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String,
    ) {

    fun getFormattedFloor() : String {
        if (this.floor > 0) {
            return "${this.floor}층"
        }
        else if (this.floor < 0) {
            return "지하 ${-this.floor}층"
        }
        else {
            return "반지하"
        }
    }

    fun getFormattedPrice() : String {
        if (this.price<10000) {
            return "${NumberFormat.getInstance().format(this.price)}만원"
        }
        else {
            return "${this.price/10000}억 ${this.price/1000 - this.price/10000 * 10},${this.price % 1000}만원"
        }

    }

}