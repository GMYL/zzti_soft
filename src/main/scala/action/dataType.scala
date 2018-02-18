package action

import pojo.Student
import utils.Utils

class dataType {
  var utils = new Utils()

  def cxzy(s: Student): Unit = {
    if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 3, 7)
    if ((new util.Random).nextInt(10) < 5) utils.mjjl(s, 3)
    if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 4, 8)
    if ((new util.Random).nextInt(10) < 7) utils.stsk(s, 4)

    var random1 = (new util.Random).nextInt(10)
    if (random1 < 4) {
      //8:00-9:30 上课/创业中心/上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 5, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 5, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 5, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 6, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 6, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 6, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 7, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 7, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 7, true)
    } else if (random1 > 3 && random1 < 8) {
      //创业中心
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 5, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 5, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 6, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 6, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 7, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 7, 2)
    } else {
      //上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 5, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 5)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 6, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 7, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 7)
    }
    var random2 = (new util.Random).nextInt(10)
    if (random2 < 4) {
      //8:00-9:30 上课/创业中心/上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 8, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 8, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 8, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 9, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 9, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 9, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 10, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 10, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 10, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 11, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 11, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 11, true)
    } else if (random2 > 3 && random1 < 8) {
      //创业中心
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 8, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 8, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 9, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 9, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 10, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 10, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 11, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 11, 2)
    } else {
      //上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 8, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 8)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 9, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 9)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 10, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 10)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 11, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 11)
    }
    var random3 = (new util.Random).nextInt(3) + 12
    utils.sxjl(s, random3, 8)
    utils.stsk(s, random3)
    if (random3 == 12) {
      var random4 = (new util.Random).nextInt(10)
      if (random4 < 4) {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 13, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 13, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 13)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 17)
      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 13, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 13, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 14, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 17, 2)
      }
    }
    if (random3 == 13) {
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 12, 7)
      if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 12, 7)
      var random4 = (new util.Random).nextInt(10)
      if (random4 < 10) {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 14)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 17)

      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 14, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 17, 2)
      }
    }
    if (random3 == 14) {
      var random4 = (new util.Random).nextInt(10)
      if (random4 < 4) {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 13, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 13, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 13)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 14, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 14)
      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 13, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 13, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 14, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 14, 2)
      }
      var random5 = (new util.Random).nextInt(10)
      if (random5 < 5) {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 15, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 15)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 16, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 17, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 17)

      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 15, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 16, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 17, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 17, 2)
      }
    }
    var random6 = (new util.Random).nextInt(10)
    if (random6 < 3) {
      //8:00-9:30 上课/创业中心/上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 18, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 18, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 18, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 19, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 19, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 19, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 20, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 20, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 20, true)
    } else if (random6 > 2 && random6 < 6) {
      //创业中心
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 18, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 18, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 19, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 19, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 20, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 20, 2)
    } else if (random6 > 6 && random6 < 8) {
      //上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 18, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 18)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 19, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 19)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 20, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 20)
    } else {
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 18, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 18, 7)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 19, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 19, 7)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 20, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 20, 7)
      if ((new util.Random).nextInt(10) < 2) utils.mjjl(s, 20)
    }
    var random7 = (new util.Random).nextInt(10)
    if (random7 < 3) {
      //8:00-9:30 上课/创业中心/上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 21, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 21, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 21, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 22, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 22, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 22, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 23, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 23, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 23, true)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 24, 3)
      if ((new util.Random).nextInt(10) < 6) utils.WIFIjl(s, 24, 3)
      if ((new util.Random).nextInt(10) < 3) utils.ckjl(s, 24, true)
    } else if (random7 > 2 && random7 < 6) {
      //创业中心
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 21, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 21, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 22, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 22, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 23, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 23, 2)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 24, 2)
      if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 24, 2)
    } else if (random7 > 6 && random7 < 8) {
      //上机
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 21, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 21)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 22, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 22)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 23, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 23)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 24, 6)
      if ((new util.Random).nextInt(10) < 10) utils.sjjl(s, 24)
    } else {
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 21, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 21, 7)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 22, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 22, 7)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 23, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 23, 7)
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 24, 7)
      if ((new util.Random).nextInt(10) < 9) utils.sxjl(s, 24, 7)
      if ((new util.Random).nextInt(10) < 2) utils.mjjl(s, 24)
    }
    var random8 = (new util.Random).nextInt(2) + 25
    utils.sxjl(s, random8, 8)
    utils.stsk(s, random8)
    if (random8 == 25) {
      var random4 = (new util.Random).nextInt(10)
      if (random4 < 2) {
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 26)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 26, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 26, 7)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 26)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 27, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 27, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 28, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 28, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 29, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 29, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 30, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 30, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 31, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 31, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 32, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 32, 7)
        if ((new util.Random).nextInt(10) < 8) utils.cqjl(s,33,true)

      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 26, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 26, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 27, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 27, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 28, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 28, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 29, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 29, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 30, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 30, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 31, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 31, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 32, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 32, 2)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 33)
        if ((new util.Random).nextInt(10) < 8) utils.cqjl(s,33,true)
      }
    }
    if (random8 == 26) {
      if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 25, 2)
      if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 25, 2)
      var random4 = (new util.Random).nextInt(10)
      if (random4 < 10) {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 27, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 27, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 28, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 28, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 29, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 29, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 30, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 30, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 31, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 31, 7)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 32, 7)
        if ((new util.Random).nextInt(10) < 8) utils.WIFIjl(s, 32, 7)
        if ((new util.Random).nextInt(10) < 8) utils.cqjl(s,33,true)
      } else {
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 27, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 27, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 28, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 28, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 29, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 29, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 30, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 30, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 31, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 31, 2)
        if ((new util.Random).nextInt(10) < 10) utils.sxjl(s, 32, 2)
        if ((new util.Random).nextInt(10) < 9) utils.WIFIjl(s, 32, 2)
        if ((new util.Random).nextInt(10) < 8) utils.mjjl(s, 33)
        if ((new util.Random).nextInt(10) < 8) utils.cqjl(s,33,true)
      }
    }


  }


}
