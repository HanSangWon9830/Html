$(function(){
    var num = 0; //슬라이드 증가 번호
    var li_w = $(".movieChart_list").width();
    // alert(li_w);

    $('.next').cllck(function(){
        if(num == 4) return;
        num++;
        $('.listWrap').stop().animate({'margin-left': -li_w * num},500);
    });


});