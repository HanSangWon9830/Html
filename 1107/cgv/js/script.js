$(function(){
    var swiper = new Swoper('.mySwiper',{
        slidesPerView: 3,
        slpaceBetween:30,
        navigation:{
            nextEl:".swiper-buttom-next",
            prevEl:".swiper-buttom-prev",
        },
        autoplay:true,
        pagination:{
            el: '.swiper-pagination',
            clickable:true,
        }
    });






    var num = 0; //슬라이드 증가번호
    var li_w = 1010; //그림 한장크기 (170 + 32) (마진) * 5
    //alert(li_w); 

    $('.next').click(function(){
        if(num == 3) return;
        num++;
        $('.listWrap').stop().animate({ 'margin-left': -li_w * num }, 500);

    });
    $('.prev').click(function(){
        if(num == 0) return;
        num--;
        $('.listWrap').stop().animate({ 'margin-left': -li_w * num }, 500);

    });
    
});