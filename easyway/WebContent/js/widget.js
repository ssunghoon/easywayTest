$(function () {
    
    // widgetWrapper 아래 위젯 생성
    // 위젯 개수 (저 밑에 색상표 8개만 썼다!)
    const widgetCount = 6;

    for (var i = 0; i < widgetCount; i++) {
        var widget = '';
        widget += '<div class="draggable widgetThumbWrapper inBar" style="position: fixed; top:'
             + (i * 15 + 7) + '%; right:-30%;">';
        widget += '    <div id="widgetThumb' + i + 
            '" class="widgetThumb shadow p-4 mb-4 bg-white"><p class="widgetCloseBtn"><i class="fas fa-times"></i></p>위젯' + (i+1) + 
            '번</div>';
        widget += '</div>';
        $('.widgetWrapper').append(widget);
    }

    // draggable
    $('.draggable').draggable({
        stack: ".draggable",
        containment: ".dock", scroll: false
    }).resizable({
        grid: 50
    });
    
    // 메뉴바 여닫기
    $('#widgetBtn').on({
        'mouseenter' : function(){
            $(this).css({
                color : '#0D6EFD'
            })
        },
        'mouseleave' : function(){
            $(this).css({
                color : '#aaa'
            })
        },
        'click' : function(){
            $('#widgetBar').animate({
                right : 0
            }, 500);
            $('.inBar').animate({
                right : 30
            }, 500, function(){
            	 $('.dockTip').fadeIn().text("이 곳에 위젯을 올려주세요");
            	 $('.dock').css({
                     opacity : 1
                 });
            });
        }
    });

    $('#closeBtn').on({
        'mouseenter' : function(){
            $(this).css({
                color : '#0D6EFD'
            })
        },
        'mouseleave' : function(){
            $(this).css({
                color : '#aaa'
            })
        },
        'click' : function(){
            $('#widgetBar, .inBar').animate({
                right: '-30%'
            }, 500);
            $('.dock').css({
                opacity : 0
            })
            $('.dockTip').text("");
        }
        
    });

    // droppable
    //var topPosition = [7, 22, 37, 52, 67, 82];
    $('.dock').droppable({
        drop: function( event, ui ) {
            $(ui.draggable)
            .switchClass("widgetThumbWrapper", "widgetConWrapper")
            .children().switchClass("widgetThumb", "widgetCon")
            .find('p').css({
               display : "block"
            })
            // 위젯 닫는 버튼
            $('.widgetCloseBtn').click(function() {
                $(this).parent().parent().attr('style', 'position: fixed; top:7%; right:-50%;')
                .switchClass("widgetConWrapper", "widgetThumbWrapper")
                .children().switchClass("widgetCon", "widgetThumb")
                .find('p').css({
                    display : "none"
                })
            });
        }
    });
    
});