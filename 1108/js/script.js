// $(function(){
//     $('.m_menu li > a').click(function(){
//         var i = $(this).index();
//        $('.m_menu li > a').removeClass('on');
//        $('.m_menu li > a').eq(i).addClass('on');
//        $('.m_menu li .sub').removeClass('on');
//        $('.m_menu li .sub').eq(i).addClass('on');
//     });
// });

























// $(function(){
//     $('.m_menu li > a').click(function(event){
//         event.preventDefault(); // 기본 앵커 동작을 막음

//         var $parentLi = $(this).parent('li'); // 클릭된 항목의 부모 <li> 요소

//         // 모든 메뉴 항목에서 'on' 클래스를 제거하고 서브메뉴 숨기기
//         $('.m_menu li').removeClass('on').find('.sub').height(0);

//         // 클릭된 항목에 'on' 클래스를 추가하고 서브메뉴 열기
//         if ($parentLi.hasClass('on')) {
//             $parentLi.removeClass('on').find('.sub').height(0); // 이미 열려 있으면 닫기
//         } else {
//             $parentLi.addClass('on').find('.sub').height('auto'); // 서브메뉴 열기
//         }
//     });
// });