package com.company.bo_thu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DataKanji {
    private static DataKanji dataKanji;

    public static DataKanji getInstance() {
        if (dataKanji == null) {
            dataKanji = new DataKanji();
        }
        return dataKanji;
    }

    public ArrayList<Thu> NihonGrade1() {
        ArrayList<Thu> thus = new ArrayList<>();
        thus.add(new Thu("Đao", "刀", false, "刂", "dao, đao, kiếm", "giống hình con dao"));
        thus.add(new Thu("Lực", "力", false, null, "sức lực, sức mạnh", "chân của chữ nam [男] nghĩa là đàn ông cần có sức khỏe"));
        thus.add(new Thu("Bao", "勹", false, null, "bao bọc", "giống hình cái bao túi có khóa kéo ở đầu"));
        return thus;
    }

    public ArrayList<Thu> NihonGrade2() {
        ArrayList<Thu> thus = new ArrayList<>();
        thus.add(new Thu("Hán", "厂", false, null, "sườn núi", "Hảo hán cũng giống như nói một người trượng phu nghĩ lớn như núi"));
        thus.add(new Thu("Hộ", "戸", false, null, "cửa", "hộ có mái che nhưng không có nét chữ miên [宀] nên chỉ coi là cổng cửa \n hoặc là cửa dùng để chặn thây ma (chữ thi [尸])"));
        thus.add(new Thu("Thi", "尸", false, null, "thây, xác chết", "giống một khuôn mặt có một vết cắt dưới khoe mắt"));
        thus.add(new Thu("Nghiễm", "广", false, null, "mái nhà", "có nét chữ miên [宀] phía trên sườn núi, chỉ mái nhà, người xưa cũng dùng khe núi vách đá làm mái nhà"));
        thus.add(new Thu("Nạch", "疒", false, null, "bệnh dịch", "giống mái nhà có tỏa uế khí"));
        thus.add(new Thu("Cân", "斤", false, null, "cái rìu", "hình cái rìu"));
        thus.add(new Thu("Ma", "麻", false, null, "cây gai", "cây gai thường được dùng để lấy lá phục vụ nhu cầu người dùng nên được nuôi trong nhà"));
        thus.add(new Thu("Hổ", "虎", false, null, "vằn vệt của hổ", "có nét vằn vệt của hổ, đuôi dưới có chữ kỷ [几], da hổ còn có thể được làm thành ghế"));
        thus.add(new Thu("Thần", "辰", false, null, "thần, thìn, bộ thiên can", null));
        thus.add(new Thu("Bì", "皮", false, null, "da, bên ngoài", "giống như có ngọn roi (chữ hán [厂]) đánh khẽ (chữ phộc [攴]), phim về anh hùng hảo hán hay gắn liền với những trận đòn roi quất lên da"));
        thus.add(new Thu("Phương", "匚", false, null, "tủ đựng đồ", "nhìn giống ngăn tủ xếp"));
        thus.add(new Thu("Hệ", "匸", false, null, "che đậy", "có nét chồi ngoài ngăn tủ (chữ phương [匚]) ra là đáy ngăn tủ, dùng để che đậy thứ gì đó"));
        thus.add(new Thu("Quynh", "冂", false, null, "biên giới", "nhìn giống như cánh cổng phía kia biên giới"));
        thus.add(new Thu("Khảm", "凵", false, null, "há miệng", "giống cái miệng há hướng lên của một loài ăn thịt"));
        thus.add(new Thu("Kệ", "ヨ", false, null, "đầu nhím", null));
        thus.add(new Thu("Thần", "臣", false, null, "bầy tôi", "có nét giống chữ phương [匚], bậc quần thần thường mặc áo gấm, khăn xếp"));
        return thus;
    }

    public ArrayList<Thu> NihonGrade3() {
        ArrayList<Thu> thus = new ArrayList<>();
        thus.add(new Thu("Hựu", "又", false, null, "lần nữa", "thuộc thành phần bộ thù [殳] vũ khí gậy gỗ: hựu [又] nghĩa là lần nữa và kỉ [几] là cái ghế, nghĩa là bị đánh nhiều lần bởi ghế thì ghế sẽ được coi như là một vũ khí bằng gỗ không hơn không kém"));
        thus.add(new Thu("Truy", "夂", false, null, "phía sau", "giống bước chân lén lút đi phía sau lúc tối muộn (chữ tịch [夕])"));
        thus.add(new Thu("Tịch", "夕", false, null, "chiều tối", "có nét giống chữ truy [夂] nghĩa là phía sau, chỉ hành động lén lút đi phía sau lúc tối muộn (chữ tịch [夕])"));
        thus.add(new Thu("Chi", "支", false, null, "nhánh, cành", "giống như cái cây có gốc rẽ"));
        thus.add(new Thu("Phộc", "攴", false, null, "đánh khẽ", "liên quan đến chữ bì [皮] giống như hành động đánh khẽ lên da"));
        thus.add(new Thu("Văn", "文", false, null, "văn thơ", "có nét nghệ thuật qua cách viết bằng các nét vẽ đơn giản của chữ miên [宀] và chữ hựu [又] nhưng vô cùng đẹp"));
        thus.add(new Thu("Ngạt", "歹", false, null, "xấu xa", "nói về một hành động độc ác liên quan đến tính mạng người (chữ tịch [夕] nghĩa là tối và cũng có nghĩa là chết, chỉ người bị chết được chôn xuống đất do có nét ngang ở trên như mặt đất)"));
        Thu thuThu = new Thu("Thù", "殳", true, null, "binh khí dài, gậy gỗ", "nhìn giống loại binh khí");
        thuThu.getContained().add(new Thu("Hựu", "又", false, null, "lần nữa", null));
        thuThu.getContained().add(new Thu("Kỉ", "几", false, null, "cái ghế", "thuộc thành phần bộ thù [殳] vũ khí gậy gỗ: hựu [又] nghĩa là lần nữa và kỉ [几] là cái ghế, nghĩa là bị đánh nhiều lần bởi ghế thì ghế sẽ được coi như là một vũ khí bằng gỗ không hơn không kém"));
        thus.add(thuThu);
        thus.add(new Thu("Danh", "名", true, null, "tên", "có sự kết hợp giữa chữ tịch [夕] nghĩa là đêm tối và nét của chữ nhật [日] nghĩa là mặt trời, ý muốn nói khi mình rạng danh cũng sẽ có phần chìm phần nổi"));
        return thus;
    }

    public ArrayList<Thu> NihonGrade4() {
        ArrayList<Thu> thus = new ArrayList<>();
        thus.add(new Thu("Bốc", "卜", false, null, "xem bói", "ngược lại với chữ nhân đứng [亻], bốc quẻ để xem bói"));
        thus.add(new Thu("Nhân", "人", false, "亻", "người", "có 2 chân giống như chân người"));
        thus.add(new Thu("nhập", "入", false, null, "vào, nhập khẩu", "gần giống nét vẽ của chữ nhân [人] nghĩa là người, cách nhớ cũng như người khi đi vào quán hay ngó nghiêng để tìm ghế ngồi"));
        thus.add(new Thu("Xích", "彳", false, null, "bước chân trái", "thuộc thành phần của bộ hành [行] : xích [彳] là bước chân trái, xúc [亍] là bước chân phải, hai hành động dẫn tới hành là đi"));
        Thu thuHanh = new Thu("Hành", "行", true, null, "đi, hành trang", "bộ hành [行] bao gồm: xích [彳] là bước chân trái, xúc [亍] là bước chân phải, hai hành động dẫn tới hành là đi");
        thuHanh.getContained().add(new Thu("Xích", "彳", false, null, "bước chân trái", "thuộc thành phần của bộ hành [行] : xích [彳] là bước chân trái, xúc [亍] là bước chân phải, hai hành động dẫn tới hành là đi"));
        thuHanh.getContained().add(new Thu("Xúc", "亍", false, null, "bước chân phải", "thuộc thành phần của bộ hành [行] : xích [彳] là bước chân trái, xúc [亍] là bước chân phải, hai hành động dẫn tới hành là đi"));
        thus.add(thuHanh);
        thus.add(new Thu("Kỉ", "几", false, null, "cái ghế", "thuộc thành phần bộ thù [殳] vũ khí gậy gỗ: hựu [又] nghĩa là lần nữa và kỉ [几] là cái ghế, nghĩa là bị đánh nhiều lần bởi ghế thì ghế sẽ được coi như là một vũ khí bằng gỗ không hơn không kém"));
        thus.add(new Thu("Củng", "廾", false, null, "chắp tay", "nét giống tư thế 2 tay đang chắp vào nhau"));
        thus.add(new Thu("Thảo", "艹", false, "艸", "loại cây cỏ", "nét vẽ có nét giống với chữ củng [廾] nghĩa là khi đi thăm mộ ở nơi đất đai co non mọc trồi, chắp tay để biểu hiện sự lấy thảo"));
        Thu thuKhiem = new Thu("Khiếm", "欠", true, null, "thiếu nợ", "bao gồm nét của chữ nhân [人] nghĩa là người và chữ mịch [冖] nghĩa là che giấu, ý nghĩa giống như một người hay che giấu những khoản nợ nần trồng chất mà anh ta có");
        thus.add(new Thu("Mịch", "冖", false, null, "che giấu", "giống như chiếc khăn dùng để che giấu"));
        thus.add(thuKhiem);
        thus.add(new Thu("Hỏa", "火", false, "灬", "lửa", "giống hình ảnh một người [人]  bị ngọn đuốc nuốt lấy"));
        Thu thuCoc = new Thu("Cốc", "谷", true, null, "hang động", "có tám [八] người [人] cùng nói chuyện [口] khi đang khám phá hang động");
        thuCoc.getContained().add(new Thu("Nhân", "人", false, "亻", "người", "có 2 chân giống như chân người"));
        thuCoc.getContained().add(new Thu("Bát", "八", false, "丷", "số 8", ""));
        thuCoc.getContained().add(new Thu("Khẩu", "口", false, null, "miệng", "có nét vẽ giống như một chiếc miệng đang há khi đang nói"));
        thus.add(thuCoc);
        thus.add(new Thu("Kim", "金", false, null, "vàng, kim loại", "nhìn nét giống như 2 người mái của căn nhà đang chia vàng bạc"));
        thus.add(new Thu("Á", "襾", true, null, "che, đậy", "có nét tương đương với chữ tây [西], như câu chuyện người ta vẫn kể về mặt trời được che dấu thay vì lặn ở đằng Tây, nếu phát hiện ra đồ che dấu sẽ kêu : Á"));
        thus.add(new Thu("Tây", "西", true, null, "phía Tây", "có nét của chữ củng [廾] nghĩa là chắp tay, Phật giáo từ Ấn Độ truyền vào nước Tàu, cho nên gọi phương Tây là đất Phật"));
        Thu thuBuu = new Thu("Bưu", "髟", true, null, "tóc dài mượt", "bao gồm nét nghĩa của tóc ([彡] sam) và dài ([長] trường) nên có nghĩa là tóc dài lướt thướt để che đi khối bưu ở đầu ");
        thuBuu.getContained().add(new Thu("Sam", "彡", false, null, "tóc, lông", "nhìn giống nét của 3 cái lông hay một nhúm tóc"));
        thuBuu.getContained().add(new Thu("Trường", "長", false, null, "dài ", "có nét vẽ của chữ thần/thìn[辰]"));
        thus.add(new Thu("Khư","厶",false,null,"riêng tư",
                "có nét thuộc bộ phận của chữ Bưu [髟] nghĩa là tóc dài, ý nghĩa là người này muốn giữ mái tóc dài cho riêng mình"));
        thus.add(thuBuu);
        thus.add(new Thu("Dậu","酉",false,null,"giờ dậu từ 5-7 giờ","gà thường gáy vào sáng sớm từ 5-7 giờ, hướng về phía mặt trời mọc chứ không phải đằng Tây [西]"));
        return thus;
    }
    public ArrayList<Thu>NihonGrade5(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Bát", "八", false, "丷", "số 8", ""));
        thus.add(new Thu("Bát", "癶", false, null, "quay lại", "giống cả âm tiếng hán lẫn nét vẽ chữ bát[八], miêu tả hoạt động quay đi tính lại rất hoạt bát"));
        thus.add(new Thu("Miên", "宀", false, null, "mái nhà", "có nét chữ mịch [冖] nghĩa là mái nhà có khả năng che chắn cho người dưới mái nhà"));
        Thu thuHuyet = new Thu("Huyệt","穴",true,null,"hang, lỗ","có sự kết hợp giữa chữ miên [宀] là mái nhà, và bát [八] là số 8, miêu tả người xưa đã có khả năng sử dụng vách núi, đã làm mái nhà, che đủ 8 người");
        thuHuyet.getContained().add(thus.get(0));
        thuHuyet.getContained().add(thus.get(2));
        thus.add(thuHuyet);
        thus.add(new Thu("Đầu", "亠", false, null, "", ""));
        thus.add(new Thu("Lập","立",false,null,"đứng thẳng","hình giống một người đứng dang hai tay"));
        Thu thuTan = new Thu("Tân","辛",true,null,"cay đắng, khổ đau","bao gồm nét vẽ của chữ lập [立] nghĩa là đứng, và chữ thập [十], liên tưởng đến hình ảnh chúa Jesus bị treo lên thập giá đau đớn và cay đắng");
        thuTan.getContained().add(new Thu("Lập","立",false,null,"đứng thẳng","hình giống một người đứng dang hai tay"));
        thuTan.getContained().add(new Thu("Thập","十",false,null,"10, số mười",null));
        thus.add(thuTan);
        Thu thuAm = new Thu("Âm","音",true,null,"âm thanh, tiếng động","được kết hợp từ chữ lập [立] nghĩa là đứng thẳng và chữ nhật [日] nghĩa là mặt trời, liên tưởng đến hình ảnh một người đứng trước bầu trời hét vang ");
        thuAm.getContained().add(new Thu("Lập","立",false,null,"đứng thẳng","hình giống một người đứng dang hai tay"));
        thuAm.getContained().add(new Thu("Nhật","日", false,null,"mặt trời, ngày","hình giống như mặt trời đang bị che khuất bởi đám mây"));
        thus.add(thuAm);
        Thu thuNgon = new Thu("Ngôn","言",true,null,"ngôn từ, lời nói","được tạo bởi chữ đầu [亠], chữ nhị [二] và chữ khẩu [口] nghĩa là miệng, ý muốn nói khi ai đó nói gì, hiểu được 2 câu đầu là hiểu được mục đích lời nói của họ");
        thuNgon.getContained().add(new Thu("Đầu", "亠", false, null, "", ""));
        thuNgon.getContained().add(new Thu("Nhị","二",false,null,"số 2","nhìn giống 2 que củi, tương đương với số lượng là con số 2"));
        thuNgon.getContained().add(new Thu("Khẩu", "口", false, null, "miệng", "có nét vẽ giống như một chiếc miệng đang há khi đang nói"));
        thus.add(thuNgon);
        thus.add(new Thu("Cao","高",false,null,"cao, đắt","được tạo bởi chữ đầu [亠] dưới có chữ quynh [冂] và 2 chữ khẩu [口] nghĩa là biên giới, liên tưởng đến việc khi bắt đầu sang một nước nào đó, cần phải đi qua một cái cửa khẩu to lớn trước mắt"));
        return thus;
    }
    public ArrayList<Thu>NihonGrade6(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Thập","十",false,null,"10, số mười",null));
        thus.add(new Thu("Thổ","土",false,null,"đất","giống như một mầm cây có 2 lá mọc lên trên" +
                "móm đất"));
        thus.add(new Thu("Thốn","寸",false,null,"đơn vị đo như tấc","giống hình cái cân treo có một quả tạ"));
        thus.add(new Thu("Đấu","斗",false,null,"đơn vị đo cho gạo hay những thứ hứng được ","giống hình cái cân nhưng cán cân bên trái là một chút thóc, lúa"));
        thus.add(new Thu("Sĩ","士",false,null,"học trò, sĩ quan","có nét giống chữ thổ [土] nghĩa là đất nhưng ngược lại và có hình " +
                "người dang tay (nét trên nhỏ, nét dưới dài hơn), trong bàn cờ tướng, quân sĩ là nền móng các quân tướng, vị trí cũng gần tướng nhất"));
        thus.add(new Thu("Can","干",false,null,"cái mộc, thứ đồ bình dùng để chống đỡ mũi nhọn hoặc tên, đạn","" +
                "có nét vẽ giống Sĩ [士], có thể nói Can là vũ khí dành cho quân Sĩ trong khi chiến trận"));
        thus.add(new Thu("Mộc","木",false,null,"Cây cối", "có nét nhìn giống cái cây có tán cành dang rộng và rẽ cắm chồi"));
        Thu thungoc = new Thu("Ngọc","玉",true,null,"đá quý, báu ngọc","chứa chữ vương [王] và chủ [丶], đại ý một người vương chủ sẽ có ngọc tỷ trong tay lưu truyền thiên hạ");
        thungoc.getContained().add(new Thu("Vương","王",false,null,"vua","nhìn có nét giống vằn vệt trên đầu con hổ, là vị vua của rừng xanh"));
        thungoc.getContained().add(new Thu("Chủ","丶",false,null,"",""));
        thus.add(thungoc);
        thus.add(new Thu("Sinh","生",false,null,"sống, sinh đẻ","có nét của chữ vương [王] muốn nói ý lời của người thân sinh phụ mẫu còn quý hơn cả mệnh lệnh vua"));
        thus.add(new Thu("Ngưu","牛",false,null,"con trâu, con bò","có nét của chữ sinh [生], nói đến những em bé mới sinh đôi khi phải dùng sữa bò thay vì sữa mẹ"));
        thus.add(new Thu("Hòa","禾",false,null,"lúa, rơm","có nét của chữ mộc [木] là cây, liên tưởng đến những cây lúa trĩu hạt"));
        thus.add(new Thu("Mễ","米",false,null,"gạo","có nét của chữ mộc [木] nghĩa là cây, nếu chữ hòa [禾] là cây lúa trĩu hạt, thì mễ có hình dáng của cây lúa đã trổ ra những hạt gạo tinh ươm"));
        Thu thuHuong = new Thu("Hương","香",true,null,"hương thơm","bao gồm nét chữ hòa [禾] và nét của chữ nhật [日], liên tưởng đến cây lúa dưới ánh mặt trời tỏa hương thơm của vụ mùa đã đến thời chín mồi");
        thuHuong.getContained().add(new Thu("Hòa","禾",false,null,"lúa, rơm","có nét của chữ mộc [木] là cây, liên tưởng đến những cây lúa trĩu hạt"));
        thuHuong.getContained().add(new Thu("Nhật","日", false,null,"mặt trời, ngày","hình giống như mặt trời đang bị che khuất bởi đám mây"));
        thus.add(thuHuong);
        thus.add(new Thu("Dương","羊",false,null,"con dê","hình liên tưởng đến con dê có 2 chiếc sừng chía ra và 3 nhúm lông ngang"));
        Thu thuChi = new Thu("Chí","至",true,null,"đến, cùng, cực","có nét chữ của chữ khư [厶] nghĩa là riêng tư, và sĩ [土] nghĩa là sĩ tử, bác sĩ, nói đến" +
                "những người có chí lớn, đến cuối cũng nên sự nghiệp vững vàng");
        thuChi.getContained().add(new Thu("Khư","厶",false,null,"riêng tư",
                "có nét thuộc bộ phận của chữ Bưu [髟] nghĩa là tóc dài, ý nghĩa là người này muốn giữ mái tóc dài cho riêng mình"));
        thuChi.getContained().add(new Thu("Thổ","土",false,null,"đất","giống như một mầm cây có 2 lá mọc lên trên" +
                "móm đất"));
        thus.add(thuChi);
        return thus;
    }
    public ArrayList<Thu>NihonGrade7(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Đại","大",false,null,"to lớn","nhìn nét có vẻ liên tưởng đến một người dang rộng hai tay để nói đến một thứ gì đó to lớn"));
        thus.add(new Thu("Nữ","女",false,null,"con gái, phụ nữ","nét vẽ mang vẻ hình ảnh của một người phụ nữ mang bụng bầu"));
        thus.add(new Thu("Uông","尢",false,null,"yếu đuối","ngược lại với chữ đại [大], nét của chữ uông nhìn giống một người đang sợ sệt, lê lết chân để có thể đi"));
        thus.add(new Thu("Phương","方",false,null,"phương hướng, đạo đức","có nét nhìn giống người đang chạy theo một hướng nhất định"));
        thus.add(new Thu("Vô","无",false,null,"không","có nét của chữ uông [尢] nghĩa là yếu đuối, một người yếu đuối đội thêm chiếc nón xấu hổ thì chắc chắn sẽ không thể làm được việc gì nên chuyện"));
        thus.add(new Thu("Khuyển","犬",false,null,"con chó","có nét của chữ đại [大] và chữ chủ [丶], nói về đức tính trung thành của loài chó, coi trọng chủ nhân lên trên mọi thứ"));
        thus.add(new Thu("Thỉ","矢",false,null,"mũi tên","có nét của chữ đại [大] hình người đang dang rộng hai tay đầu hàng, nhưng cuối cùng bị một mũi tên to tướng cắm xuyên qua đầu"));
        return thus;
    }
    public ArrayList<Thu>NihonGrade8(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Tiểu","小",false,null,"nhỏ bé","có nét hình người co rúm lại khi thấy bản thân nhỏ bé so với những thứ xung quanh"));
        thus.add(new Thu("Tâm","心",false,"忄","trái tim","có nét giống hình trái tym và các mao mạch vách ngăn"));
        thus.add(new Thu("Thị","礻",false,"示","biểu thị","có nét giống chữ Ne bảng katakana, như câu :\"Nè Nè\" có ý biểu thị miêu tả thứ gì đó"));
        setUpThus(thus,"Y","衣",false,"衤","xiêm y, áo","cách viết thứ hai có nét gần giống chữ thị [礻] mang nghĩa biểu thị, làm ta liên tưởng đến việc việc biểu thị thường " +
                "được so sánh một cách gần như y hệt",null);
        return thus;
    }
    public ArrayList<Thu>NihonGrade9(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Khẩu","口",false,null,"miệng","có nét hình miệng người đang há rộng"));
        thus.add(new Thu("Vi","囗",false,null,"bao quanh","có nét hình một căn phòng có 4 bức tường bao quanh"));
        thus.add(new Thu("Nhật","日",false,null,"mặt trời, ngày","có nét hình mặt trời được che khuất bởi đám mây"));
        thus.add(new Thu("Nguyệt","月",false,null,"mặt trăng, tháng","có nét giống hình mặt trăng khuyết"));
        thus.add(new Thu("Mẫu","母",false,null,"mẹ, mẫu hậu","có nét hình người phụ nữ mang bầu"));
        thus.add(new Thu("Tiết","卩",false,null,"đốt tre","chữ có hình chiếc đốt tre"));
        thus.add(new Thu("Vô","毋",false,null,"chớ, đừng","khung nét có sự na ná với chữ mẫu [母], có liên tưởng đến câu nói" +
                " cùng là người sinh ra, chớ đừng quên người mẹ "));
        thus.add(new Thu("Cam","甘",false,null,"ngọt","Cam lộ được tương truyền như một loại thuốc trường sinh để dâng lên vua, nên sẽ được để " +
                "trong lồng cẩn thận như nét vẽ hình cái khay cho các vua và quan thần để đựng đồ ăn. Vì thức dâng lên vua nên mĩ vị có thể có vị ngọt nặng"));
        thus.add(new Thu("Dụng","用",false,null,"sử dụng","có nét giống chữ nguyệt [月] nghĩa là mặt trăng, bị bổ đôi như chiếc búa Mjölnir của Thor được rèn từ mặt trăng sau đó mới được đem ra sử dụng" +
                ", búa cũng có thể được dùng để chế tác dụng cụ "));
        thus.add(new Thu("Điền","田",false,null,"ruộng","nét vẽ có hình một miếng ruộng đã được canh tác"));
        Thu thuBach = new Thu("Bạch","白",true,null,"màu trắng","được cấu thành từ nét của chữ nhật [日], và chữ chủ [丶], có thể nói ngày chủ nhật là ngày nghỉ cuối tuần," +
                "là ngày sáng lạng và thảnh thơi nhất trong tuần. Trên tờ lịch để trắng trống ngày chủ nhật vì không có việc gì để làm");
        thuBach.getContained().add(thus.get(2));
        thus.add(thuBach);
        thus.add(new Thu("Mục","目",false,null,"con mắt","nét có hình con ngươi lật ngược"));
        Thu thuTu = new Thu("Tự","自",true,null,"tự làm, tự mình","được cấu thành bởi chữ mục [目] mang nghĩa là con mắt, và chữ chủ [丶] nên có thể nói, nếu chủ động tự mình" +
                "nhìn vấn đề bằng chính con mắt của mình cũng chính là ý nghĩa của từ \"tự chủ\"");
        thuTu.getContained().add(thus.get(10));
        thus.add(thuTu);
        thus.add(new Thu("Mãnh","皿",false,null,"bát đĩa","có nét của chữ mục [目] nghĩa là con mắt lộn ngược, ý muốn nói những" +
                "lời trách cứ khi ai làm vỡ bát đĩa sẽ bị hỏi : \"Mắt để trên trán à ?\" "));
        thus.add(new Thu("Võng","罒",false,null,"cái lưới","nhìn giống nét của chữ mãnh [皿] nhưng nhỏ và đều hơn," +
                "có hình giống một cái lưới bắt cá"));
        Thu thuHuyet = new Thu("Huyết","血",true,null,"máu","có nét của chữ mãnh [皿] nghĩa là bát đĩa, làm ta liên tưởng đến những việc" +
                "cần phải hiến tế hay cũng bái mê tín cần dùng đến bát chứa máu đầy của vật được hiến tế");
        thuHuyet.getContained().add(thus.get(12));
        thus.add(thuHuyet);
        Thu thuThach = new Thu("Thạch","石",true,null,"đá sỏi","được cấu thành từ chữ khẩu [口] và nét vẽ na ná chữ hán [厂] có nghĩa là sườn núi, liên tưởng đến " +
                "hình ảnh đám nông phu hò dô để cùng nhau mang vật nặng qua vách núi đá");
        thuThach.getContained().add(thus.get(0));
        thus.add(thuThach);
        thus.add(new Thu("Trảo","爪", false,null,"móng","cấu thành từ nét vẽ na ná nét vẽ đầu của chữ cân [斤] nghĩa là cây rìu, liên tưởng đến một vật sắc nhọn," +
                "ngoài ra nét vẽ của chữ có ba nét dọc tượng trưng cho móng hổ"));
        thus.add(new Thu("Phiến","片",false,null,"mảng, tấm","cấu thành từ chữ có nét giống như nét của chữ nghiễm [广] nghĩa là " +
                "mái nhà, khiến mình có thể liên tưởng, thời điểm trước đây, người dân hay dùng phiến tảng lợp mái"));
        thus.add(new Thu("Nhĩ","耳",false,null,"tai","nét chữ hình chiếc tai bên trái"));
        thus.add(new Thu("Nhục","肉",false,null,"thịt","nét chữ hình một lát thịt cắt với nham nhở gân"));
        Thu thuThiet = new Thu("Thiệt","舌",true,null,"lưỡi","có bao gồm chữ khẩu [口] là miệng, ngoài ra có nét vẽ hình người phía trên làm ta liên tưởng đến " +
                "một người dang hai tay ra chịu thiệt vì miệng lưỡi vạ lây");
        thuThiet.getContained().add(thus.get(0));
        thus.add(thuThiet);
        Thu thuKien = new Thu("Kiến","見",true,null,"trông thấy, nhìn thấy","có cấu thành từ chữ mục [目] có nghĩa là con mắt, nét phía dưới có hình hai chiếc chân" +
                "khiến ta hiểu rằng phải đi, tham quan kiến nghiệp thì có thể nhìn thấy, trông thấy được vô vàn thứ");
        thuKien.getContained().add(thus.get(10));
        thus.add(thuKien);
        thus.add(new Thu("Giác","角",false,null,"sừng","có nét hình chiếc sừng trên đầu con chữ, cộng với nét dưới na ná chữ dụng [用] khiến ta liên tưởng đến " +
                "việc sử dụng khai thác sừng tê giác, động vật quý hiếm bừa bãi để sử dụng"));
        thus.add(new Thu("Đậu","豆",false,null,"hạt đậu, cây đậu","các nét làm ta liên tưởng đến dưới bề mặt của đất có một hạt đậu nhỏ" +
                "đang đâm hai chiếc rẽ từ đất lên để đâm trồi nảy nở"));
        Thu thuBoi = new Thu("Bối","貝",true,null,"sò, động vật vỏ cứng","có bao gồm cả chữ mục [目] nghĩa là con mắt và cũng na ná hình chiếc vỏ sò và có hai chân" +
                "của con vật ký sinh vỏ sò vỏ ốc rất đẹp và thích mắt. Vỏ sò vỏ ốc còn được dùng để trao đổi buôn bán thời xa xưa nên cũng được coi là bảo bối");
        thuBoi.getContained().add(thus.get(10));
        thus.add(thuBoi);
        thus.add(new Thu("Thân","身",false,null,"thân thể","các nét chữ có hình cánh tay, cổ, thân dưới và xương sườn" +
                "làm ta cảm tưởng đến thân thể của một người"));
        thus.add(new Thu("Xa","車",false,null,"xe","là nét của chữ xa trong quân xa trong bộ cờ tướng"));
        Thu thuHiet = new Thu("Hiệt","頁",true,null,"trang giấy","nét chữ bao gồm nét vẽ chữ bối [貝] nghĩa là vỏ sò,liên tưởng đến những" +
                "chiếc thư viết tay một trang có những miếng vỏ sò nhỏ đẹp trang trí để kèm bên trong chai có nút");
        thus.add(thuHiet);
        Thu thuThu = new Thu("Thủ","首",true,null,"đầu, thủ cấp, đứng đầu","có nét của chữ tự [自] nghĩa là tự mình, làm ta liên tưởng " +
                "đến những người thường cho mình đứng đầu và để tỏ ra mình đứng đầu thì họ có quyền đội mũ lòe loẹt hay trang trí khác lạ để cho mình nổi bật, khác người");
        thuThu.getContained().add(thus.get(11));
        thus.add(thuThu);
        thus.add(new Thu("Diện","面",false,null,"khuôn mặt","có nét hình chữ thủ [首] nghĩa là cái đầu nhưng chỉ có một nét " +
                "và nhỏ hơn"));
        thus.add(new Thu("Lí","里",false,null,"hải lí, dặm","có nét chữ điền [田] nghĩa là ruộng, liên tưởng đến" +
                "việc làm ruộng cần phải tính lượng nước canh tác, hải lí"));
        Thu thuThanh = new Thu("Thanh","青",true,null,"xanh","" +
                "được cấu thành từ chữ nguyệt [月] có nghĩa là mặt trăng, nét phía trên như mặt nước gợn sóng, làm ta liên tưởng đến ánh trăng chiếu xuống mặt hồ " +
                "gợn sóng xanh biếc");
        thuThanh.getContained().add(thus.get(3));
        thus.add(thuThanh);
        setUpThus(thus,"Chủy","匕",false,null,"cái thìa","nét vẽ của chữ làm ta liên tưởng đến cái thìa hay cái muôi múc đang múc vào bát canh",null);
        ArrayList<Thu>thuLao = new ArrayList<>();
        setUpThus(thuLao,"Chủy","匕",false,null,"cái thìa","nét vẽ của chữ làm ta liên tưởng đến cái thìa hay cái muôi múc đang múc vào bát canh",null);
        setUpThus(thus,"Tỷ","比",true,null,"tỷ dụ,so sánh","được cấu thành bởi chữ chủy [匕] có nghĩa là muôi, thìa, 2 nét chữ tượng trưng cho 2 chiếc thìa dài ngắn khác nhau" +
                " ý muốn so sánh giữa hai thứ chúng",thuLao);
        setUpThus(thus,"Lão","老",true,"耂","già","được cấu thành từ chữ chủy [匕] nghĩa là cái muôi, cái thìa và nét chữ giống chữ thổ [土] nghĩa là đất, làm ta liên tưởng đến" +
                "hình ảnh của người tuổi già, cần phải chăm sóc cả nơi sinh dưỡng và đồ ăn uống dưỡng già một cách đặc biệt",thuLao);
        ArrayList<Thu>thuXich = new ArrayList<>();
        thuXich.add(new Thu("Thổ","土",false,null,"đất","giống như một mầm cây có 2 lá mọc lên trên" +
                "móm đất"));
        setUpThus(thus,"Xích","赤",true,null,"màu đỏ","được bao gồm bởi chữ thổ [土] có nghĩa là đất, và nét giống chữ đao [刀] nghĩa là dao, kiếm làm ta liên tưởng đến việc tranh chấp" +
                " đất đai gây đổ máu, bất hòa",thuXich);
        Thu thuCot = new Thu("Cốt","骨",true,null,"xương","được cấu thành từ chữ nguyệt [月] nghĩa là mặt trăng, và nét của chữ mịch [冖] nghĩa là che dấu," +
                "ta cũng có thể nhìn ra ở đầu chữ có hình giống một lối đi, làm ta liên tưởng đến hình ảnh dưới ánh trăng sáng, chiếc hẻm tối che lấp bộ xương " +
                "được hắt lên những vệt ánh trăng");
        thuCot.getContained().add(thus.get(3));
        thus.add(thuCot);
        Thu thuHac = new Thu("Hắc","黒",true,null,"đen","được cấu thành từ chữ lí [里] nghĩa là dặm và chữ hỏa" +
                "[灬] (biến thể), làm ta liên tưởng đến một đám cháy rừng phát ra ngàn dặm, muôn vật đều bị cháy đen thui hết");
        thuHac.getContained().add(thus.get(30));
        thus.add(thuHac);
        return thus;
    }
    public ArrayList<Thu>Nihongrade10(){
        ArrayList<Thu>thus = new ArrayList<>();
        thus.add(new Thu("Cách","鬲",false,null,"tên loại vật dụng giống cái đỉnh","chữ này có nét vẽ giống cái đỉnh"));
        thus.add(new Thu("Ngư","魚",false,null,"con cá","cấu thành từ chữ điền [田] nghĩa là ruộng và chữ hỏa [灬] nghĩa là lửa " +
                "liên tưởng đến người dân đánh bắt cá ở đồng ruộng và đem đi nướng lửa thui"));
        thus.add(new Thu("Điểu","鳥",false,null,"con chim","" +
                "nét vẽ liên tưởng đến hình con chim có cánh lông vũ"));
        thus.add(new Thu("Sắc","色",false,null,"màu sắc","có chứa nét giống chữ giác [角] nghĩa là sừng, có nét hình gương mặt đang cười," +
                "làm ta liên tưởng đến một gã háo sắc và ham cái đẹp, không quản cắm sừng"));
        thus.add(new Thu("Hoàng","黄",false,null,"màu vàng","" +
                "có nét của chữ cam [甘] nghĩa là ngọt và chữ điền [田] nghĩa là ruộng, nên ta có thể hiểu trái ngọt và ruộng nương quý như vàng như bạc"));
        thus.add(new Thu("Tý","畀",false,null,"ban cho","được cấu thành từ chữ điền [田] và" +
                "chữ củng [廾] có nghĩa là chắp tay, liên tưởng đến hình ảnh người dân đen phải chắp tay để xin mẫu ruộng đất" +
                "nên được ban cho một tý "));
        Thu thuTi = new Thu("Tị","鼻",true,null,"cái mũi","" +
                "được cấu thành từ chữ tự [自] nghĩa là tự mình và chữ tý [畀] nghĩa là ban cho, nên ta có thể hiểu nôm" +
                "na rằng cơ thể tự ban cho mình chiếc mũi để có thể ngửi và thưởng thức món ăn, khác với tất cả loài " +
                "động vật khác không biết thưởng thức món ăn bằng cả khứu giác, vị giác và xúc giác");
        thuTi.getContained().add(thus.get(5));
        Thu thuTu = new Thu("Tự","自",true,null,"tự làm, tự mình","được cấu thành bởi chữ mục [目] mang nghĩa là con mắt, và chữ chủ [丶] nên có thể nói, nếu chủ động tự mình" +
                "nhìn vấn đề bằng chính con mắt của mình cũng chính là ý nghĩa của từ \"tự chủ\"");
        thuTu.getContained().add(new Thu("Mục","目",false,null,"con mắt","nét có hình con ngươi lật ngược"));
        thuTi.getContained().add(thuTu);
        thus.add(thuTi);
        return thus;
    }
    public ArrayList<Thu>Nihongrade11(){
        ArrayList<Thu>thus = new ArrayList<>();
        Thu thuTriet = new Thu("Triệt","屮",true,null,"" +
                "mầm non","được cấu thành từ chữ khảm [凵] nghĩa là miệng và chữ phiệt [丿], liên tưởng đến việc dùng miệng," +
                "khi qh sẽ triệt tiêu mầm non giống nòi");
        thuTriet.getContained().add(new Thu("Khảm", "凵", false, null, "há miệng", "giống cái miệng há hướng lên của một loài ăn thịt"));
        thus.add(thuTriet);
        thus.add(new Thu("Sơn","山",false,null,"núi","" +
                "nét vẽ làm liên tưởng đến hình ảnh 3 ngọn núi nhấp nhô chập trùng"));
        thus.add(new Thu("Cân","巾",false,null,"cái khăn","" +
                "có nét vẽ giống chữ triệt [屮] nghĩa là mầm non lộn ngược, làm ta liên tưởng đến việc đó cũng cần thiết " +
                "phải có khăn"));
        thus.add(new Thu("Xuyên","川",false,"巛","sông ngòi","" +
                "nếu chữ sơn [山] làm liên tưởng đến 3 ngọn núi trập trùng thì chữ xuyên làm liên tưởng đến ngọn sóng có " +
                "3 vệt nước đến từ sông ngòi"));
        Thu thuChi = new Thu("Chỉ","止",true,null,"dừng lại","" +
                "được cấu tành từ nét của chữ bốc [卜] có nghĩa là xem bói, liên tưởng đến việc xem bói có giới hạn, chỉ đến đâu và dừng lại");
        thuChi.getContained().add(new Thu("Bốc", "卜", false, null, "xem bói", "ngược lại với chữ nhân đứng [亻], bốc quẻ để xem bói"));
        thus.add(thuChi);
        thus.add(new Thu("Phẫu","缶",false,null,"đồ sành","" +
                "được cấu thành bởi những nét na ná giống chữ ngưu [牛] có nghĩa là trâu bò và chữ sơn [山] có nghĩa là núi, làm ta liên tưởng đến " +
                "hình ảnh người đánh xe bò để trở những đồ phẫu, đồ sành lên núi"));
        return thus;
    }
    public ArrayList<Thu>Nihongrade12(){
        ArrayList<Thu>thus = new ArrayList<>();
        setUpThus(thus,"Băng","冫",false,null,"băng giá","" +
                "hai nét của chữ có nét giống như một miếng băng nhọn hoắt hướng lên",null);
        setUpThus(thus,"Thủy","水",false,null,"nước","các nét " +
                "chữ có hình một giọt nước bị rơi rồi tóe ra mọi phía",null);
        setUpThus(thus,"Yêu","幺",false,null,"nhỏ","như yêu tinh là quái vật tý hon, chữ yêu để chỉ những thứ nhỏ bé, nét chữ còn gần giống chữ e," +
                "mang ý nghĩa e dè, e ấp, cảm thấy mình nhỏ bé so với chung quanh",null);
        ArrayList<Thu>thusHuyen = new ArrayList<>();
        setUpThus(thusHuyen,"Đầu", "亠", false, null, "", "",null);
        thusHuyen.add(thus.get(2));
        setUpThus(thus,"Huyền","玄",true,null,"màu đen","được cấu thành từ chữ đầu [亠] và chữ yêu [幺] có nghĩa là nhỏ bé," +
                "làm ta liên tưởng đến tình yêu đầu luôn nhỏ bé và đen đúa",thusHuyen);
        setUpThus(thus,"Mịch","糸",false,null,"sợi tơ nhỏ","được cấu thành bởi các nét giống chữ yêu [幺] và chữ tiểu [小] đều mang nghĩa là nhỏ bé," +
                "bên cạnh đó phía dưới có nét giống như bua bủa những sợi tơ nhỏ vây quanh",null);
        return thus;
    }
    public ArrayList<Thu>NihonGrade13(){
        ArrayList<Thu>thus = new ArrayList<>();
        setUpThus(thus,"Thủ","手",false,"扌","tay, tay nghề","nét viết chữ thủ giống hình con rết có nhiều chân," +
                ", biểu thị một người lam lũ vất vả làm việc có nghìn tay như con rết mới hết việc",null);
        setUpThus(thus,"Mao","毛",false,null,"lông mao, lông chân lông tay","có nét viết gần như giống chữ thủ [手] có nghĩa là " +
                "tay, làm ta liên tưởng đến việc một người nhiều tay sẽ tất nhiên có nhiều lông tay",null);
        setUpThus(thus,"Thỉ","豕",false,null,"con lợn","có nét viết gần giống chữ thủ [手] có nghĩa là tay, liên tưởng đến hình ảnh " +
                "người bát thịt thủ thỉ với cây dao đang cầm trên tay chuẩn bị giết con lợn",null);
        setUpThus(thus,"Tử","子",false,null,"con","có nét viết giống số 7, có hình dáng nhô ra như bóng của bà mẹ mang bầu đứa con sắp " +
                "chào đời",null);
        ArrayList<Thu>thusMau = new ArrayList<>();
        setUpThus(thusMau,"Dư","予",false,null,"ta, tôi","có nét viết giống chữ tử [子] nghĩa là con, làm liên tưởng đến hình ảnh ông bố ôn tồn nói chuyện với đứa con",null);
        setUpThus(thus,"Mâu","矛",true,null,"cái giáo","được cấu tạo bởi chữ dư [予] có nghĩa là nhân xưng ta, tôi và chữ phiệt [丿], mang hình ảnh một người " +
                "dân với nhân xưng \"tôi\" và \" chúng ta \" kêu gọi người dân khởi nghĩa chống quân phiệt với vũ khí là những cây mâu ",thusMau);
        setUpThus(thus,"Nha","牙",false,null,"răng","hai nét đầu có hình mũi người, phần phía dưới là bờ môi nhô ra," +
                "bên trong là hàm răng hô",null);
        return thus;
    }
    public ArrayList<Thu>NihonN5Captoc(){
        ArrayList<Thu>thus = new ArrayList<>();
        setUpThus(thus,null,"一",false,null,"1",null,null);
        setUpThus(thus,null,"ニ",false,null,"1",null,null);
        setUpThus(thus,null,"三",false,null,"1",null,null);
        setUpThus(thus,null,"四",false,null,"1",null,null);
        setUpThus(thus,null,"五",false,null,"1",null,null);
        setUpThus(thus,null,"六",false,null,"1",null,null);
        setUpThus(thus,null,"七",false,null,"1",null,null);
        setUpThus(thus,null,"八",false,null,"1",null,null);
        setUpThus(thus,null,"九",false,null,"1",null,null);
        setUpThus(thus,null,"十",false,null,"1",null,null);
        setUpThus(thus,null,"百",false,null,"1",null,null);
        setUpThus(thus,null,"千",false,null,"1",null,null);
        setUpThus(thus,null,"万",false,null,"1",null,null);
        setUpThus(thus,null,"円",false,null,"1",null,null);
        setUpThus(thus,null,"口",false,null,"1",null,null);
        setUpThus(thus,null,"目",false,null,"1",null,null);
        setUpThus(thus,null,"日",false,null,"2",null,null);
        setUpThus(thus,null,"月",false,null,"2",null,null);
        setUpThus(thus,null,"火",false,null,"2",null,null);
        setUpThus(thus,null,"水",false,null,"2",null,null);
        setUpThus(thus,null,"木",false,null,"2",null,null);
        setUpThus(thus,null,"金",false,null,"2",null,null);
        setUpThus(thus,null,"土",false,null,"2",null,null);
        setUpThus(thus,null,"曜",false,null,"2",null,null);
        setUpThus(thus,null,"本",false,null,"2",null,null);
        setUpThus(thus,null,"人",false,null,"2",null,null);
        setUpThus(thus,null,"今",false,null,"2",null,null);
        setUpThus(thus,null,"寺",false,null,"2",null,null);
        setUpThus(thus,null,"時",false,null,"2",null,null);
        setUpThus(thus,null,"半",false,null,"2",null,null);
        setUpThus(thus,null,"刀",false,null,"2",null,null);
        setUpThus(thus,null,"分",false,null,"2",null,null);
        setUpThus(thus,null,"上",false,null,"3",null,null);
        setUpThus(thus,null,"下",false,null,"3",null,null);
        setUpThus(thus,null,"中",false,null,"3",null,null);
        setUpThus(thus,null,"外",false,null,"3",null,null);
        setUpThus(thus,null,"右",false,null,"3",null,null);
        setUpThus(thus,null,"エ",false,null,"3",null,null);
        setUpThus(thus,null,"左",false,null,"3",null,null);
        setUpThus(thus,null,"前",false,null,"3",null,null);
        setUpThus(thus,null,"後",false,null,"3",null,null);
        setUpThus(thus,null,"午",false,null,"3",null,null);
        setUpThus(thus,null,"門",false,null,"3",null,null);
        setUpThus(thus,null,"間",false,null,"3",null,null);
        setUpThus(thus,null,"東",false,null,"3",null,null);
        setUpThus(thus,null,"西",false,null,"3",null,null);
        setUpThus(thus,null,"南",false,null,"3",null,null);
        setUpThus(thus,null,"北",false,null,"3",null,null);
        setUpThus(thus,null,"田",false,null,"4",null,null);
        setUpThus(thus,null,"カ",false,null,"4",null,null);
        setUpThus(thus,null,"男",false,null,"4",null,null);
        setUpThus(thus,null,"女",false,null,"4",null,null);
        setUpThus(thus,null,"子",false,null,"4",null,null);
        setUpThus(thus,null,"学",false,null,"4",null,null);
        setUpThus(thus,null,"生",false,null,"4",null,null);
        setUpThus(thus,null,"先",false,null,"4",null,null);
        setUpThus(thus,null,"何",false,null,"4",null,null);
        setUpThus(thus,null,"父",false,null,"4",null,null);
        setUpThus(thus,null,"母",false,null,"4",null,null);
        setUpThus(thus,null,"年",false,null,"4",null,null);
        setUpThus(thus,null,"去",false,null,"4",null,null);
        setUpThus(thus,null,"毎",false,null,"4",null,null);
        setUpThus(thus,null,"王",false,null,"4",null,null);
        setUpThus(thus,null,"国",false,null,"4",null,null);
        setUpThus(thus,null,"見",false,null,"5",null,null);
        setUpThus(thus,null,"行",false,null,"5",null,null);
        setUpThus(thus,null,"米",false,null,"5",null,null);
        setUpThus(thus,null,"来",false,null,"5",null,null);
        setUpThus(thus,null,"良",false,null,"5",null,null);
        setUpThus(thus,null,"食",false,null,"5",null,null);
        setUpThus(thus,null,"飲",false,null,"5",null,null);
        setUpThus(thus,null,"会",false,null,"5",null,null);
        setUpThus(thus,null,"耳",false,null,"5",null,null);
        setUpThus(thus,null,"聞",false,null,"5",null,null);
        setUpThus(thus,null,"言",false,null,"5",null,null);
        setUpThus(thus,null,"話",false,null,"5",null,null);
        setUpThus(thus,null,"立",false,null,"5",null,null);
        setUpThus(thus,null,"待",false,null,"5",null,null);
        setUpThus(thus,null,"周",false,null,"5",null,null);
        setUpThus(thus,null,"週",false,null,"5",null,null);
        setUpThus(thus,null,"大",false,null,"6",null,null);
        setUpThus(thus,null,"小",false,null,"6",null,null);
        setUpThus(thus,null,"高",false,null,"6",null,null);
        setUpThus(thus,null,"安",false,null,"6",null,null);
        setUpThus(thus,null,"新",false,null,"6",null,null);
        setUpThus(thus,null,"古",false,null,"6",null,null);
        setUpThus(thus,null,"元",false,null,"6",null,null);
        setUpThus(thus,null,"気",false,null,"6",null,null);
        setUpThus(thus,null,"多",false,null,"6",null,null);
        setUpThus(thus,null,"少",false,null,"6",null,null);
        setUpThus(thus,null,"広",false,null,"6",null,null);
        setUpThus(thus,null,"早",false,null,"6",null,null);
        setUpThus(thus,null,"長",false,null,"6",null,null);
        setUpThus(thus,null,"明",false,null,"6",null,null);
        setUpThus(thus,null,"好",false,null,"6",null,null);
        setUpThus(thus,null,"友",false,null,"6",null,null);
        setUpThus(thus,null,"入",false,null,"7",null,null);
        setUpThus(thus,null,"出",false,null,"7",null,null);
        setUpThus(thus,null,"市",false,null,"7",null,null);
        setUpThus(thus,null,"町",false,null,"7",null,null);
        setUpThus(thus,null,"村",false,null,"7",null,null);
        setUpThus(thus,null,"雨",false,null,"7",null,null);
        setUpThus(thus,null,"電",false,null,"7",null,null);
        setUpThus(thus,null,"車",false,null,"7",null,null);
        setUpThus(thus,null,"馬",false,null,"7",null,null);
        setUpThus(thus,null,"駅",false,null,"7",null,null);
        setUpThus(thus,null,"社",false,null,"7",null,null);
        setUpThus(thus,null,"校",false,null,"7",null,null);
        setUpThus(thus,null,"店",false,null,"7",null,null);
        setUpThus(thus,null,"銀",false,null,"7",null,null);
        setUpThus(thus,null,"病",false,null,"7",null,null);
        setUpThus(thus,null,"院",false,null,"7",null,null);
        setUpThus(thus,null,"休",false,null,"8",null,null);
        setUpThus(thus,null,"走",false,null,"8",null,null);
        setUpThus(thus,null,"起",false,null,"8",null,null);
        setUpThus(thus,null,"貝",false,null,"8",null,null);
        setUpThus(thus,null,"買",false,null,"8",null,null);
        setUpThus(thus,null,"売",false,null,"8",null,null);
        setUpThus(thus,null,"読",false,null,"8",null,null);
        setUpThus(thus,null,"書",false,null,"8",null,null);
        setUpThus(thus,null,"帰",false,null,"8",null,null);
        setUpThus(thus,null,"勉",false,null,"8",null,null);
        setUpThus(thus,null,"弓",false,null,"8",null,null);
        setUpThus(thus,null,"虫",false,null,"8",null,null);
        setUpThus(thus,null,"強",false,null,"8",null,null);
        setUpThus(thus,null,"持",false,null,"8",null,null);
        setUpThus(thus,null,"名",false,null,"8",null,null);
        setUpThus(thus,null,"語",false,null,"8",null,null);
        setUpThus(thus,null,"春",false,null,"9",null,null);
        setUpThus(thus,null,"夏",false,null,"9",null,null);
        setUpThus(thus,null,"秋",false,null,"9",null,null);
        setUpThus(thus,null,"冬",false,null,"9",null,null);
        setUpThus(thus,null,"朝",false,null,"9",null,null);
        setUpThus(thus,null,"昼",false,null,"9",null,null);
        setUpThus(thus,null,"夕",false,null,"9",null,null);
        setUpThus(thus,null,"方",false,null,"9",null,null);
        setUpThus(thus,null,"晩",false,null,"9",null,null);
        setUpThus(thus,null,"夜",false,null,"9",null,null);
        setUpThus(thus,null,"心",false,null,"9",null,null);
        setUpThus(thus,null,"手",false,null,"9",null,null);
        setUpThus(thus,null,"足",false,null,"9",null,null);
        setUpThus(thus,null,"体",false,null,"9",null,null);
        setUpThus(thus,null,"首",false,null,"9",null,null);
        setUpThus(thus,null,"道",false,null,"9",null,null);
        setUpThus(thus,null,"山",false,null,"10",null,null);
        setUpThus(thus,null,"川",false,null,"10",null,null);
        setUpThus(thus,null,"林",false,null,"10",null,null);
        setUpThus(thus,null,"森",false,null,"10",null,null);
        setUpThus(thus,null,"空",false,null,"10",null,null);
        setUpThus(thus,null,"海",false,null,"10",null,null);
        setUpThus(thus,null,"化",false,null,"10",null,null);
        setUpThus(thus,null,"花",false,null,"10",null,null);
        setUpThus(thus,null,"天",false,null,"10",null,null);
        setUpThus(thus,null,"赤",false,null,"10",null,null);
        setUpThus(thus,null,"青",false,null,"10",null,null);
        setUpThus(thus,null,"白",false,null,"10",null,null);
        setUpThus(thus,null,"黒",false,null,"10",null,null);
        setUpThus(thus,null,"色",false,null,"10",null,null);
        setUpThus(thus,null,"魚",false,null,"10",null,null);
        setUpThus(thus,null,"犬",false,null,"10",null,null);
        setUpThus(thus,null,"料",false,null,"11",null,null);
        setUpThus(thus,null,"理",false,null,"11",null,null);
        setUpThus(thus,null,"反",false,null,"11",null,null);
        setUpThus(thus,null,"飯",false,null,"11",null,null);
        setUpThus(thus,null,"牛",false,null,"11",null,null);
        setUpThus(thus,null,"豚",false,null,"11",null,null);
        setUpThus(thus,null,"鳥",false,null,"11",null,null);
        setUpThus(thus,null,"肉",false,null,"11",null,null);
        setUpThus(thus,null,"茶",false,null,"11",null,null);
        setUpThus(thus,null,"予",false,null,"11",null,null);
        setUpThus(thus,null,"野",false,null,"11",null,null);
        setUpThus(thus,null,"菜",false,null,"11",null,null);
        setUpThus(thus,null,"切",false,null,"11",null,null);
        setUpThus(thus,null,"作",false,null,"11",null,null);
        setUpThus(thus,null,"末",false,null,"11",null,null);
        setUpThus(thus,null,"味",false,null,"11",null,null);
        setUpThus(thus,null,"音",false,null,"12",null,null);
        setUpThus(thus,null,"楽",false,null,"12",null,null);
        setUpThus(thus,null,"歌",false,null,"12",null,null);
        setUpThus(thus,null,"自",false,null,"12",null,null);
        setUpThus(thus,null,"転",false,null,"12",null,null);
        setUpThus(thus,null,"乗",false,null,"12",null,null);
        setUpThus(thus,null,"写",false,null,"12",null,null);
        setUpThus(thus,null,"真",false,null,"12",null,null);
        setUpThus(thus,null,"台",false,null,"12",null,null);
        setUpThus(thus,null,"央",false,null,"12",null,null);
        setUpThus(thus,null,"映",false,null,"12",null,null);
        setUpThus(thus,null,"画",false,null,"12",null,null);
        setUpThus(thus,null,"羊",false,null,"12",null,null);
        setUpThus(thus,null,"洋",false,null,"12",null,null);
        setUpThus(thus,null,"服",false,null,"12",null,null);
        setUpThus(thus,null,"着",false,null,"12",null,null);
        setUpThus(thus,null,"家",false,null,"13",null,null);
        setUpThus(thus,null,"矢",false,null,"13",null,null);
        setUpThus(thus,null,"族",false,null,"13",null,null);
        setUpThus(thus,null,"親",false,null,"13",null,null);
        setUpThus(thus,null,"兄",false,null,"13",null,null);
        setUpThus(thus,null,"姉",false,null,"13",null,null);
        setUpThus(thus,null,"弟",false,null,"13",null,null);
        setUpThus(thus,null,"妹",false,null,"13",null,null);
        setUpThus(thus,null,"私",false,null,"13",null,null);
        setUpThus(thus,null,"夫",false,null,"13",null,null);
        setUpThus(thus,null,"妻",false,null,"13",null,null);
        setUpThus(thus,null,"主",false,null,"13",null,null);
        setUpThus(thus,null,"住",false,null,"13",null,null);
        setUpThus(thus,null,"糸",false,null,"13",null,null);
        setUpThus(thus,null,"氏",false,null,"13",null,null);
        setUpThus(thus,null,"紙",false,null,"13",null,null);
        setUpThus(thus,null,"教",false,null,"14",null,null);
        setUpThus(thus,null,"室",false,null,"14",null,null);
        setUpThus(thus,null,"羽",false,null,"14",null,null);
        setUpThus(thus,null,"習",false,null,"14",null,null);
        setUpThus(thus,null,"漢",false,null,"14",null,null);
        setUpThus(thus,null,"字",false,null,"14",null,null);
        setUpThus(thus,null,"式",false,null,"14",null,null);
        setUpThus(thus,null,"試",false,null,"14",null,null);
        setUpThus(thus,null,"験",false,null,"14",null,null);
        setUpThus(thus,null,"宿",false,null,"14",null,null);
        setUpThus(thus,null,"題",false,null,"14",null,null);
        setUpThus(thus,null,"文",false,null,"14",null,null);
        setUpThus(thus,null,"英",false,null,"14",null,null);
        setUpThus(thus,null,"質",false,null,"14",null,null);
        setUpThus(thus,null,"問",false,null,"14",null,null);
        setUpThus(thus,null,"説",false,null,"14",null,null);
        setUpThus(thus,null,"遠",false,null,"15",null,null);
        setUpThus(thus,null,"近",false,null,"15",null,null);
        setUpThus(thus,null,"者",false,null,"15",null,null);
        setUpThus(thus,null,"暑",false,null,"15",null,null);
        setUpThus(thus,null,"寒",false,null,"15",null,null);
        setUpThus(thus,null,"重",false,null,"15",null,null);
        setUpThus(thus,null,"軽",false,null,"15",null,null);
        setUpThus(thus,null,"低",false,null,"15",null,null);
        setUpThus(thus,null,"弱",false,null,"15",null,null);
        setUpThus(thus,null,"悪",false,null,"15",null,null);
        setUpThus(thus,null,"暗",false,null,"15",null,null);
        setUpThus(thus,null,"太",false,null,"15",null,null);
        setUpThus(thus,null,"豆",false,null,"15",null,null);
        setUpThus(thus,null,"短",false,null,"15",null,null);
        setUpThus(thus,null,"光",false,null,"15",null,null);
        setUpThus(thus,null,"風",false,null,"15",null,null);
        setUpThus(thus,null,"運",false,null,"16",null,null);
        setUpThus(thus,null,"動",false,null,"16",null,null);
        setUpThus(thus,null,"止",false,null,"16",null,null);
        setUpThus(thus,null,"歩",false,null,"16",null,null);
        setUpThus(thus,null,"使",false,null,"16",null,null);
        setUpThus(thus,null,"送",false,null,"16",null,null);
        setUpThus(thus,null,"洗",false,null,"16",null,null);
        setUpThus(thus,null,"急",false,null,"16",null,null);
        setUpThus(thus,null,"開",false,null,"16",null,null);
        setUpThus(thus,null,"閉",false,null,"16",null,null);
        setUpThus(thus,null,"押",false,null,"16",null,null);
        setUpThus(thus,null,"引",false,null,"16",null,null);
        setUpThus(thus,null,"思",false,null,"16",null,null);
        setUpThus(thus,null,"知",false,null,"16",null,null);
        setUpThus(thus,null,"考",false,null,"16",null,null);
        setUpThus(thus,null,"死",false,null,"16",null,null);
        setUpThus(thus,null,"医",false,null,"17",null,null);
        setUpThus(thus,null,"始",false,null,"17",null,null);
        setUpThus(thus,null,"終",false,null,"17",null,null);
        setUpThus(thus,null,"石",false,null,"17",null,null);
        setUpThus(thus,null,"研",false,null,"17",null,null);
        setUpThus(thus,null,"究",false,null,"17",null,null);
        setUpThus(thus,null,"留",false,null,"17",null,null);
        setUpThus(thus,null,"有",false,null,"17",null,null);
        setUpThus(thus,null,"産",false,null,"17",null,null);
        setUpThus(thus,null,"業",false,null,"17",null,null);
        setUpThus(thus,null,"薬",false,null,"17",null,null);
        setUpThus(thus,null,"働",false,null,"17",null,null);
        setUpThus(thus,null,"員",false,null,"17",null,null);
        setUpThus(thus,null,"士",false,null,"17",null,null);
        setUpThus(thus,null,"仕",false,null,"17",null,null);
        setUpThus(thus,null,"事",false,null,"17",null,null);
        setUpThus(thus,null,"図",false,null,"18",null,null);
        setUpThus(thus,null,"官",false,null,"18",null,null);
        setUpThus(thus,null,"館",false,null,"18",null,null);
        setUpThus(thus,null,"昔",false,null,"18",null,null);
        setUpThus(thus,null,"借",false,null,"18",null,null);
        setUpThus(thus,null,"代",false,null,"18",null,null);
        setUpThus(thus,null,"貸",false,null,"18",null,null);
        setUpThus(thus,null,"地",false,null,"18",null,null);
        setUpThus(thus,null,"世",false,null,"18",null,null);
        setUpThus(thus,null,"界",false,null,"18",null,null);
        setUpThus(thus,null,"度",false,null,"18",null,null);
        setUpThus(thus,null,"回",false,null,"18",null,null);
        setUpThus(thus,null,"用",false,null,"18",null,null);
        setUpThus(thus,null,"民",false,null,"18",null,null);
        setUpThus(thus,null,"注",false,null,"18",null,null);
        setUpThus(thus,null,"意",false,null,"18",null,null);
        setUpThus(thus,null,"頭",false,null,"19",null,null);
        setUpThus(thus,null,"顔",false,null,"19",null,null);
        setUpThus(thus,null,"声",false,null,"19",null,null);
        setUpThus(thus,null,"特",false,null,"19",null,null);
        setUpThus(thus,null,"別",false,null,"19",null,null);
        setUpThus(thus,null,"竹",false,null,"19",null,null);
        setUpThus(thus,null,"合",false,null,"19",null,null);
        setUpThus(thus,null,"答",false,null,"19",null,null);
        setUpThus(thus,null,"正",false,null,"19",null,null);
        setUpThus(thus,null,"同",false,null,"19",null,null);
        setUpThus(thus,null,"計",false,null,"19",null,null);
        setUpThus(thus,null,"京",false,null,"19",null,null);
        setUpThus(thus,null,"集",false,null,"19",null,null);
        setUpThus(thus,null,"不",false,null,"19",null,null);
        setUpThus(thus,null,"便",false,null,"19",null,null);
        setUpThus(thus,null,"以",false,null,"19",null,null);
        setUpThus(thus,null,"場",false,null,"20",null,null);
        setUpThus(thus,null,"戸",false,null,"20",null,null);
        setUpThus(thus,null,"所",false,null,"20",null,null);
        setUpThus(thus,null,"屋",false,null,"20",null,null);
        setUpThus(thus,null,"堂",false,null,"20",null,null);
        setUpThus(thus,null,"都",false,null,"20",null,null);
        setUpThus(thus,null,"県",false,null,"20",null,null);
        setUpThus(thus,null,"区",false,null,"20",null,null);
        setUpThus(thus,null,"池",false,null,"20",null,null);
        setUpThus(thus,null,"発",false,null,"20",null,null);
        setUpThus(thus,null,"建",false,null,"20",null,null);
        setUpThus(thus,null,"物",false,null,"20",null,null);
        setUpThus(thus,null,"品",false,null,"20",null,null);
        setUpThus(thus,null,"旅",false,null,"20",null,null);
        setUpThus(thus,null,"通",false,null,"20",null,null);
        setUpThus(thus,null,"進",false,null,"20",null,null);
        setUpThus(thus,null,"丸",false,null,"21",null,null);
        setUpThus(thus,null,"熱",false,null,"21",null,null);
        setUpThus(thus,null,"冷",false,null,"21",null,null);
        setUpThus(thus,null,"甘",false,null,"21",null,null);
        setUpThus(thus,null,"汚",false,null,"21",null,null);
        setUpThus(thus,null,"果",false,null,"21",null,null);
        setUpThus(thus,null,"卵",false,null,"21",null,null);
        setUpThus(thus,null,"皿",false,null,"21",null,null);
        setUpThus(thus,null,"酒",false,null,"21",null,null);
        setUpThus(thus,null,"塩",false,null,"21",null,null);
        setUpThus(thus,null,"付",false,null,"21",null,null);
        setUpThus(thus,null,"片",false,null,"21",null,null);
        setUpThus(thus,null,"焼",false,null,"21",null,null);
        setUpThus(thus,null,"消",false,null,"21",null,null);
        setUpThus(thus,null,"固",false,null,"21",null,null);
        setUpThus(thus,null,"個",false,null,"21",null,null);
        setUpThus(thus,null,"笑",false,null,"22",null,null);
        setUpThus(thus,null,"泣",false,null,"22",null,null);
        setUpThus(thus,null,"怒",false,null,"22",null,null);
        setUpThus(thus,null,"幸",false,null,"22",null,null);
        setUpThus(thus,null,"悲",false,null,"22",null,null);
        setUpThus(thus,null,"苦",false,null,"22",null,null);
        setUpThus(thus,null,"痛",false,null,"22",null,null);
        setUpThus(thus,null,"恥",false,null,"22",null,null);
        setUpThus(thus,null,"配",false,null,"22",null,null);
        setUpThus(thus,null,"困",false,null,"22",null,null);
        setUpThus(thus,null,"辛",false,null,"22",null,null);
        setUpThus(thus,null,"眠",false,null,"22",null,null);
        setUpThus(thus,null,"残",false,null,"22",null,null);
        setUpThus(thus,null,"念",false,null,"22",null,null);
        setUpThus(thus,null,"感",false,null,"22",null,null);
        setUpThus(thus,null,"情",false,null,"22",null,null);
        setUpThus(thus,null,"覚",false,null,"23",null,null);
        setUpThus(thus,null,"忘",false,null,"23",null,null);
        setUpThus(thus,null,"決",false,null,"23",null,null);
        setUpThus(thus,null,"定",false,null,"23",null,null);
        setUpThus(thus,null,"比",false,null,"23",null,null);
        setUpThus(thus,null,"受",false,null,"23",null,null);
        setUpThus(thus,null,"授",false,null,"23",null,null);
        setUpThus(thus,null,"徒",false,null,"23",null,null);
        setUpThus(thus,null,"練",false,null,"23",null,null);
        setUpThus(thus,null,"復",false,null,"23",null,null);
        setUpThus(thus,null,"表",false,null,"23",null,null);
        setUpThus(thus,null,"卒",false,null,"23",null,null);
        setUpThus(thus,null,"違",false,null,"23",null,null);
        setUpThus(thus,null,"役",false,null,"23",null,null);
        setUpThus(thus,null,"皆",false,null,"23",null,null);
        setUpThus(thus,null,"彼",false,null,"23",null,null);
        setUpThus(thus,null,"全",false,null,"24",null,null);
        setUpThus(thus,null,"部",false,null,"24",null,null);
        setUpThus(thus,null,"必",false,null,"24",null,null);
        setUpThus(thus,null,"要",false,null,"24",null,null);
        setUpThus(thus,null,"荷",false,null,"24",null,null);
        setUpThus(thus,null,"由",false,null,"24",null,null);
        setUpThus(thus,null,"届",false,null,"24",null,null);
        setUpThus(thus,null,"利",false,null,"24",null,null);
        setUpThus(thus,null,"払",false,null,"24",null,null);
        setUpThus(thus,null,"濯",false,null,"24",null,null);
        setUpThus(thus,null,"寝",false,null,"24",null,null);
        setUpThus(thus,null,"踊",false,null,"24",null,null);
        setUpThus(thus,null,"活",false,null,"24",null,null);
        setUpThus(thus,null,"未",false,null,"24",null,null);
        setUpThus(thus,null,"宅",false,null,"24",null,null);
        setUpThus(thus,null,"祭",false,null,"24",null,null);
        setUpThus(thus,null,"平",false,null,"25",null,null);
        setUpThus(thus,null,"和",false,null,"25",null,null);
        setUpThus(thus,null,"戦",false,null,"25",null,null);
        setUpThus(thus,null,"争",false,null,"25",null,null);
        setUpThus(thus,null,"政",false,null,"25",null,null);
        setUpThus(thus,null,"治",false,null,"25",null,null);
        setUpThus(thus,null,"経",false,null,"25",null,null);
        setUpThus(thus,null,"済",false,null,"25",null,null);
        setUpThus(thus,null,"法",false,null,"25",null,null);
        setUpThus(thus,null,"律",false,null,"25",null,null);
        setUpThus(thus,null,"際",false,null,"25",null,null);
        setUpThus(thus,null,"関",false,null,"25",null,null);
        setUpThus(thus,null,"係",false,null,"25",null,null);
        setUpThus(thus,null,"義",false,null,"25",null,null);
        setUpThus(thus,null,"議",false,null,"25",null,null);
        setUpThus(thus,null,"党",false,null,"25",null,null);
        setUpThus(thus,null,"遊",false,null,"26",null,null);
        setUpThus(thus,null,"泳",false,null,"26",null,null);
        setUpThus(thus,null,"疲",false,null,"26",null,null);
        setUpThus(thus,null,"暖",false,null,"26",null,null);
        setUpThus(thus,null,"涼",false,null,"26",null,null);
        setUpThus(thus,null,"静",false,null,"26",null,null);
        setUpThus(thus,null,"公",false,null,"26",null,null);
        setUpThus(thus,null,"園",false,null,"26",null,null);
        setUpThus(thus,null,"込",false,null,"26",null,null);
        setUpThus(thus,null,"連",false,null,"26",null,null);
        setUpThus(thus,null,"窓",false,null,"26",null,null);
        setUpThus(thus,null,"側",false,null,"26",null,null);
        setUpThus(thus,null,"葉",false,null,"26",null,null);
        setUpThus(thus,null,"景",false,null,"26",null,null);
        setUpThus(thus,null,"記",false,null,"26",null,null);
        setUpThus(thus,null,"形",false,null,"26",null,null);
        setUpThus(thus,null,"吉",false,null,"27",null,null);
        setUpThus(thus,null,"結",false,null,"27",null,null);
        setUpThus(thus,null,"婚",false,null,"27",null,null);
        setUpThus(thus,null,"共",false,null,"27",null,null);
        setUpThus(thus,null,"供",false,null,"27",null,null);
        setUpThus(thus,null,"両",false,null,"27",null,null);
        setUpThus(thus,null,"若",false,null,"27",null,null);
        setUpThus(thus,null,"老",false,null,"27",null,null);
        setUpThus(thus,null,"息",false,null,"27",null,null);
        setUpThus(thus,null,"娘",false,null,"27",null,null);
        setUpThus(thus,null,"奥",false,null,"27",null,null);
        setUpThus(thus,null,"将",false,null,"27",null,null);
        setUpThus(thus,null,"祖",false,null,"27",null,null);
        setUpThus(thus,null,"育",false,null,"27",null,null);
        setUpThus(thus,null,"性",false,null,"27",null,null);
        setUpThus(thus,null,"招",false,null,"27",null,null);
        setUpThus(thus,null,"取",false,null,"28",null,null);
        setUpThus(thus,null,"最",false,null,"28",null,null);
        setUpThus(thus,null,"初",false,null,"28",null,null);
        setUpThus(thus,null,"番",false,null,"28",null,null);
        setUpThus(thus,null,"歳",false,null,"28",null,null);
        setUpThus(thus,null,"枚",false,null,"28",null,null);
        setUpThus(thus,null,"冊",false,null,"28",null,null);
        setUpThus(thus,null,"億",false,null,"28",null,null);
        setUpThus(thus,null,"点",false,null,"28",null,null);
        setUpThus(thus,null,"階",false,null,"28",null,null);
        setUpThus(thus,null,"段",false,null,"28",null,null);
        setUpThus(thus,null,"号",false,null,"28",null,null);
        setUpThus(thus,null,"倍",false,null,"28",null,null);
        setUpThus(thus,null,"次",false,null,"28",null,null);
        setUpThus(thus,null,"々",false,null,"28",null,null);
        setUpThus(thus,null,"他",false,null,"28",null,null);
        setUpThus(thus,null,"勝",false,null,"29",null,null);
        setUpThus(thus,null,"負",false,null,"29",null,null);
        setUpThus(thus,null,"賛",false,null,"29",null,null);
        setUpThus(thus,null,"成",false,null,"29",null,null);
        setUpThus(thus,null,"絶",false,null,"29",null,null);
        setUpThus(thus,null,"対",false,null,"29",null,null);
        setUpThus(thus,null,"続",false,null,"29",null,null);
        setUpThus(thus,null,"辞",false,null,"29",null,null);
        setUpThus(thus,null,"投",false,null,"29",null,null);
        setUpThus(thus,null,"選",false,null,"29",null,null);
        setUpThus(thus,null,"約",false,null,"29",null,null);
        setUpThus(thus,null,"束",false,null,"29",null,null);
        setUpThus(thus,null,"守",false,null,"29",null,null);
        setUpThus(thus,null,"過",false,null,"29",null,null);
        setUpThus(thus,null,"夢",false,null,"29",null,null);
        setUpThus(thus,null,"的",false,null,"29",null,null);
        setUpThus(thus,null,"飛",false,null,"30",null,null);
        setUpThus(thus,null,"機",false,null,"30",null,null);
        setUpThus(thus,null,"先",false,null,"30",null,null);
        setUpThus(thus,null,"鉄",false,null,"30",null,null);
        setUpThus(thus,null,"速",false,null,"30",null,null);
        setUpThus(thus,null,"遅",false,null,"30",null,null);
        setUpThus(thus,null,"駐",false,null,"30",null,null);
        setUpThus(thus,null,"泊",false,null,"30",null,null);
        setUpThus(thus,null,"船",false,null,"30",null,null);
        setUpThus(thus,null,"座",false,null,"30",null,null);
        setUpThus(thus,null,"席",false,null,"30",null,null);
        setUpThus(thus,null,"島",false,null,"30",null,null);
        setUpThus(thus,null,"陸",false,null,"30",null,null);
        setUpThus(thus,null,"港",false,null,"30",null,null);
        setUpThus(thus,null,"橋",false,null,"30",null,null);
        setUpThus(thus,null,"交",false,null,"30",null,null);
        setUpThus(thus,null,"申",false,null,"31",null,null);
        setUpThus(thus,null,"神",false,null,"31",null,null);
        setUpThus(thus,null,"様",false,null,"31",null,null);
        setUpThus(thus,null,"信",false,null,"31",null,null);
        setUpThus(thus,null,"調",false,null,"31",null,null);
        setUpThus(thus,null,"査",false,null,"31",null,null);
        setUpThus(thus,null,"相",false,null,"31",null,null);
        setUpThus(thus,null,"談",false,null,"31",null,null);
        setUpThus(thus,null,"案",false,null,"31",null,null);
        setUpThus(thus,null,"内",false,null,"31",null,null);
        setUpThus(thus,null,"君",false,null,"31",null,null);
        setUpThus(thus,null,"達",false,null,"31",null,null);
        setUpThus(thus,null,"星",false,null,"31",null,null);
        setUpThus(thus,null,"雪",false,null,"31",null,null);
        setUpThus(thus,null,"降",false,null,"31",null,null);
        setUpThus(thus,null,"直",false,null,"31",null,null);
        setUpThus(thus,null,"危",false,null,"32",null,null);
        setUpThus(thus,null,"険",false,null,"32",null,null);
        setUpThus(thus,null,"拾",false,null,"32",null,null);
        setUpThus(thus,null,"捨",false,null,"32",null,null);
        setUpThus(thus,null,"戻",false,null,"32",null,null);
        setUpThus(thus,null,"吸",false,null,"32",null,null);
        setUpThus(thus,null,"放",false,null,"32",null,null);
        setUpThus(thus,null,"変",false,null,"32",null,null);
        setUpThus(thus,null,"歯",false,null,"32",null,null);
        setUpThus(thus,null,"髪",false,null,"32",null,null);
        setUpThus(thus,null,"絵",false,null,"32",null,null);
        setUpThus(thus,null,"横",false,null,"32",null,null);
        setUpThus(thus,null,"当",false,null,"32",null,null);
        setUpThus(thus,null,"伝",false,null,"32",null,null);
        setUpThus(thus,null,"細",false,null,"32",null,null);
        setUpThus(thus,null,"無",false,null,"32",null,null);
        return thus;
    }
    public ArrayList<Thu>Usual(){
        ArrayList<Thu>thus = new ArrayList<>();
        ArrayList<Thu>thuVat = new ArrayList<>();
        setUpThus(thuVat,"Bao", "勹", false, null, "bao bọc", "giống hình cái bao túi có khóa kéo ở đầu",null);
        setUpThus(thus,"Vật","勿",true,null,"chớ đừng","được kết hợp bởi chữ " +
                "bao [勹] nghĩa là cái bao và chữ phiệt [丿], nghĩa là chớ nên mua đồ phiệt",thuVat);
        ArrayList<Thu>thuDoc = new ArrayList<>();
        ArrayList<Thu>thuMai = new ArrayList<>();
        setUpThus(thuMai,"Sĩ","士",false,null,"học trò, sĩ quan","có nét giống chữ thổ [土] nghĩa là đất nhưng ngược lại và có hình " +
                "người dang tay (nét trên nhỏ, nét dưới dài hơn), trong bàn cờ tướng, quân sĩ là nền móng các quân tướng, vị trí cũng gần tướng nhất",null);
        setUpThus(thuDoc,"売","Mại",true,null,"thương mại","được cấu thành từ chữ sĩ [士] nghĩa là kẻ sĩ," +
                "người học thức và chữ có nét giống chữ củng [廾] có nghĩa là chắp tay, mang hàm ý nghĩa một người giao dịch giỏi giang là biết khiêm nhường",thuMai);
        setUpThus(thuDoc,"Ngôn","言",false,null,"ngôn từ, lời nói","được tạo bởi chữ đầu [亠], chữ nhị [二] và chữ khẩu [口] nghĩa là miệng, ý muốn nói khi ai đó nói gì, hiểu được 2 câu đầu là hiểu được mục đích lời nói của họ",null);
        setUpThus(thus,"Độc","読",true,null,"độc giả","được cấu thành bởi chữ ngôn [言] và chữ mại [言], mang ý nghĩa " +
                "một người đọc giả là một vị khách hàng lắng nghe những ngôn từ của người viết ",thuDoc);
        ArrayList<Thu>thuTHoai = new ArrayList<>();
        setUpThus(thuTHoai,"Ngôn"," ",false,null,"ngôn từ, lời nói","được tạo bởi chữ đầu [亠], chữ nhị [二] và chữ khẩu [口] nghĩa là miệng, ý muốn nói khi ai đó nói gì, hiểu được 2 câu đầu là hiểu được mục đích lời nói của họ",null);
        setUpThus(thuTHoai,"Thiệt","舌",false,null,"lưỡi","có bao gồm chữ khẩu [口] là miệng, ngoài ra có nét vẽ hình người phía trên làm ta liên tưởng đến " +
                "một người dang hai tay ra chịu thiệt vì miệng lưỡi vạ lây",null);
        setUpThus(thus,"Thoại","話",true,null,"lời nói","được cấu thành từ chữ ngôn [言] có nghĩa là ngôn từ và chữ thiệt [舌] có nghĩa là lưỡi, muốn nói rằng muốn nói ra lời nào đều có " +
                "trong đầu cách suy nghĩ của ngôn từ và cuối cùng thốt ra bằng miệng lưỡi",thuTHoai);
        ArrayList<Thu>thuHoi = new ArrayList<>();
        setUpThus(thuHoi,"Nhân","人", false, "亻", "người", "có 2 chân giống như chân người",null);
        ArrayList<Thu>thuVan = new ArrayList<>();
        setUpThus(thuVan,"Nhị","二",false,null,"số 2","nhìn giống 2 que củi, tương đương với số lượng là con số 2",null);
        setUpThus(thuVan,"Khư","厶",false,null,"riêng tư",
                "có nét thuộc bộ phận của chữ Bưu [髟] nghĩa là tóc dài, ý nghĩa là người này muốn giữ mái tóc dài cho riêng mình",null);
        setUpThus(thuHoi,"Vân","云",true,null,"rằng, vân vân","được cấu thành từ chữ nhị [二] là số 2 và chữ khư [厶] nghĩa là riêng mình," +
                "ý muốn nói rằng người nào mà luôn thủ sẵn một đôi đồ vật cho riêng thì đồ sẽ vô kể",thuVan);
        setUpThus(thus,"Hội","会",true,null,"chỗ đông người, hội họp","được cấu thành bởi chữ nhân [人] nghĩa là người và chữ vân [云] nghĩa là vân vân, nhiều," +
                "mang hàm ý chỉ một nơi đông đúc như đang họp",thuHoi);
        return thus;
    }
    public ArrayList<Thu>setUpThus(ArrayList<Thu>thus,String hanName,String wayWrite,boolean contained,
                                   String anotherForm,String meaning, String cheatingMeaning,ArrayList<Thu>component){
        Thu thu = new Thu(hanName,wayWrite,contained,anotherForm,meaning,cheatingMeaning);
        if(contained){
            for (int i = 0; i < component.size(); i++) {
                thu.getContained().add(component.get(i));
            }
        }
        thus.add(thu);
        return thus;
    }
    public Thu[] getAllData(ArrayList<Thu> thus) {
        Thu[] thus_array = new Thu[thus.size()];
        for (int i = 0; i < thus.size(); i++) {
            thus_array[i] = thus.get(i);
        }
        return thus_array;
    }

    public ArrayList<Thu> NihonAllGrade() {
        ArrayList<Thu> thus = new ArrayList<>();
        Collections.addAll(thus, getAllData(NihonGrade1()));
        Collections.addAll(thus, getAllData(NihonGrade2()));
        Collections.addAll(thus, getAllData(NihonGrade3()));
        Collections.addAll(thus, getAllData(NihonGrade4()));
        Collections.addAll(thus, getAllData(NihonGrade5()));
        Collections.addAll(thus, getAllData(NihonGrade6()));
        Collections.addAll(thus, getAllData(NihonGrade7()));
        Collections.addAll(thus,getAllData(NihonGrade8()));
        Collections.addAll(thus,getAllData(NihonGrade9()));
        Collections.addAll(thus,getAllData(Nihongrade10()));
        Collections.addAll(thus,getAllData(Nihongrade11()));
        Collections.addAll(thus,getAllData(Nihongrade12()));
        Collections.addAll(thus,getAllData(NihonGrade13()));
        Collections.addAll(thus,getAllData(NihonN5Captoc()));
        Collections.addAll(thus,getAllData(Usual()));
        return thus;
    }
}
