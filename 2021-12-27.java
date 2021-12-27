
		// 주민번호를 residentNo 을 data에서 받아와 뒷자리수를 구분하여 19년생 20년생인지 구분하기
        var birthDay = 0;
		var juminResult = data.residentNo;
		var jumin = juminResult.substring(0,6);
		var juminValid = juminResult.substring(6,7);
		 
		if (juminValid != 0 && juminValid <= 2) {
			birthDay = '19' + jumin;
		} else if (juminValid != 0 && juminValid <= 4) {
			birthDay = '20' + jumin;
		} else {
			birthDay = '';
		} return birthDay;