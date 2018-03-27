// $(document).ready(function(){
    function HostBusiness(){
    	this.cpu = 1;
    	this.memory = 2;
    	var cpuMemMapper = {
	        1: [2, 4],
	        2: [4, 8],
	        4: [4, 16],
	        8: [8, 32],
	        16: [16, 64]
	    };

        var baseConfig = {
            cpu: 1,
            memory: 2,
            disksize: 0,
            net: 6
        };

        var stepConfig = {
            cpu: {
                step: 1,
                price: 50
            },
            memory: [
                {
                    step: 1,
                    price: 120
                },
                {
                    step: 2,
                    price: 150
                },
                {
                    step: 4,
                    price: 270
                }
            ],
            disksize: {
                step: 10,
                price: 4
            },
            net: {
                step: 1,
                price: 100
            },
            net_db: {
                step: 1,
                price: 200
            }
        };

	    var self = this;
	    this.setMem = function(){
	    	self.memory = cpuMemMapper[self.cpu][0];
	    };
    	this.checkMem = function(mem, cpu){
        	return mem>=cpuMemMapper[cpu][0] && mem<=cpuMemMapper[cpu][1];
    	};
    }
    var hostBusiness = new HostBusiness();

    function selectCpu(cpu){
    	var cpuList = $(".cpu").children();
    	for (var i = 0; i < cpuList.length; i++) {
    		cpuList.eq(i).removeClass('current');
    	};
    	$('#cpu_'+cpu).addClass('current');

    	hostBusiness.cpu = cpu;
    	hostBusiness.setMem();
    	var mem_id = "mem_" + hostBusiness.memory;
    	console.log(mem_id);
    	var memList = $(".memory").children();
    	for (var i = 0; i < memList.length; i++) {
    		memList.eq(i).removeClass('current');
    	};
    	$("#"+mem_id).addClass('current');


		var mem, memObj;

		for (var i = 0; i < memList.length; i++) {
			memObj = memList.eq(i);
			mem = memObj.attr('id').split('_')[1];
			if(hostBusiness.checkMem(mem, cpu)){
				memObj.removeClass('unactive');
			} else {
				memObj.addClass('unactive');
			}
		};
    }

    function selectMem(mem){
    	var memObj = $("#mem_"+mem);
    	if (memObj.hasClass('unactive')) {
    		return false;
    	};
    	var memList = $(".memory").children();
    	for (var i = 0; i < memList.length; i++) {
    		memList.eq(i).removeClass('current');
    	};
    	memObj.addClass('current');
    	hostBusiness.memory = mem;
    }

    $( "#diskslider" ).slider({
        orientation: 'horizontal',
        min: 20,
        max: 1000,
        step: 50,
        range: 'min',
        animate: true,
        slide: function(event, ui) {
        	$("#diskvalue").val(ui.value);
        }
	});

    $( "#netslider" ).slider({
        orientation: 'horizontal',
        min: 2,
        max: 100,
        range: 'min',
        animate: true,
        slide: function(event, ui) {
        	$("#netvalue").val(ui.value);
        }
	});

	function selectNet(netType){
		if (netType==0) {
			$(".net").hide();
		}else{
			$(".net").show();
		}
		var netTypeList = $(".net-type").children();
		for (var i = 0; i < netTypeList.length; i++) {
			netTypeList.eq(i).removeClass('current');
		};
		$("#nettype_"+netType).addClass('current');
	}