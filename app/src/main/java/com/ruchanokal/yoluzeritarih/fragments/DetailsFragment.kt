package com.ruchanokal.yoluzeritarih.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ruchanokal.yoluzeritarih.R
import com.ruchanokal.yoluzeritarih.databinding.FragmentDetailsBinding
import com.ruchanokal.yoluzeritarih.databinding.FragmentMainBinding

class DetailsFragment : Fragment() {

    private var binding: FragmentDetailsBinding? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentDetailsBinding.inflate(inflater, container, false)
        val view = binding!!.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments?.let {
            val ilceAdi = DetailsFragmentArgs.fromBundle(it).ilce

            if (ilceAdi.equals("besiktas")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.VISIBLE
                binding!!.detaylarCardView3.visibility = View.VISIBLE
                binding!!.detaylarCardView4.visibility = View.VISIBLE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text = "Beşiktaş'ta Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.dolmabahce)
                binding!!.gezilecekBaslikText.text = "Dolmabahçe Sarayı"
                binding!!.gezilecekAciklamaText.text = "Saray, sona eren Osmanlı İmparatorluğu’nun önemli simgelerinden " +
                        "biridir ve 1843 ile 1856 yıllar arasında inşa edilmiştir. Sarayın içerisinde; toplamda 285 oda, " +
                        "44 adet salon, 68 adet banyo ve 6 adet hamam bulunmaktadır."

                binding!!.gezilecekImageView2.setImageResource(R.drawable.yildizsarayi)
                binding!!.gezilecekBaslikText2.text = "Yıldız Sarayı"
                binding!!.gezilecekAciklamaText2.text = "Yıldız Sarayı, dönemin padişahı III. Selim’in annesi için inşa edilmiş ve " +
                        "daha sonra, II. Abdulhamit döneminde, ana saray olarak kullanılmıştır. Yıldız Sarayı, avlularını " +
                        "çevreleyen ve farklı tasarımlara sahip bölümleri ve bahçeleri " +
                        "ile oldukça büyüleyici bir görünüme sahiptir. Sarayın bahçesi, 16. Yüzyılda," +
                        " dönemin padişahları tarafından avlanmak için kullanılmıştır."


                binding!!.gezilecekImageView3.setImageResource(R.drawable.ortakoy)
                binding!!.gezilecekBaslikText3.text = "Ortaköy Cami"
                binding!!.gezilecekAciklamaText3.text = "Tarihi Ortaköy Camii 19. yüzyılın ortalarında iki Ermeni Mimar " +
                        "Nigoğos Balyan ve Garabet Amira Balyan tarafından inşa edilen ve Neo- Barok tarzının güzel " +
                        "bir örneği olan Ortaköy Cami, Sultan Abdulmecit tarafından yaptırılmıştır.  Cami, halk " +
                        "arasında Ortaköy Cami olarak anılsa da asıl adı Büyük Mecidiye Cami’dir. "


                binding!!.gezilecekImageView4.setImageResource(R.drawable.barbarospasa)
                binding!!.gezilecekBaslikText4.text = "Barbaros Hayrettin Paşa Türbesi"
                binding!!.gezilecekAciklamaText4.text = "Beşiktaş ilçesinde, tarihi Sinan Paşa Cami’nin karşısında " +
                        "yer alan Barbaros Hayrettin Paşa Türbesi; 16. Yüzyıl dönemine ait bir Mimar Sinan eseridir. " +
                        "Barbaros Hayrettin Paşa, eşi Bala Hatun ve Hasan Paşa’nın mezarının yer aldığı türbe, " +
                        "tek kubbeli ve sekiz köşeli bir türbedir."

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("dolmabahce")
                    Navigation.findNavController(it).navigate(action)

                }

                binding!!.detayliBilgi2.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("yildiz")
                    Navigation.findNavController(it).navigate(action)

                }

                binding!!.detayliBilgi3.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("ortakoy")
                    Navigation.findNavController(it).navigate(action)

                }

                binding!!.detayliBilgi4.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("barbaros")
                    Navigation.findNavController(it).navigate(action)

                }


            } else if (ilceAdi.equals("yesilkoy")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text = "Yeşilköy'de Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.ucakmuzesi)
                binding!!.gezilecekBaslikText.text = "Hava Kuvvetleri Müzesi"
                binding!!.gezilecekAciklamaText.text = "Müzenin tarihi I. Dünya Savaşı’na kadar dayanmaktadır. " +
                        "Savaş sonunda elde bulunan farklı milletlere ait uçaklar, müze kurma fikrini ortaya " +
                        "çıkarmıştır ve düşmandan elde edilen ganimetlerden de müzeye uygun olacak parçalar " +
                        "toplanmaya başlanmıştır. Kurtuluş Savaşı sırasında bu parçaların zarar görebileceği" +
                        " düşünülmüş ve uçaklar Maltepe’ye taşınmaya başlamıştır. Ancak nakliye sırasında" +
                        " uçakların hasar görmesi ve Kurtuluş Savaşı’nda uçaklardan zaiyat verilmesi ile" +
                        " müze kurma fikrinden vazgeçilmiştir. Yıl 1960’a geldiğinde Hava Kuvvetleri " +
                        "Komutanı Hava Orgeneral İrfan Tansel, bir havacılık müzesi kurulması için " +
                        "direktif vermiş ve ilk adımları bizzat kendisi atmıştır. Yapılan uzun çalışmalar " +
                        "sonucunda müze 15 Mayıs 1971’de İzmir’de hayata geçmiştir."

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("yesilkoy")
                    Navigation.findNavController(it).navigate(action)

                }


            } else if (ilceAdi.equals("arnavutkoy")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text ="Arnavutköy'de Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.arnavutkoytarihievler)
                binding!!.gezilecekBaslikText.text = "Tarihi Arnavutköy Evleri"
                binding!!.gezilecekAciklamaText.text = "Tarihi Arnavutköy Evleri Arnavutköy; tarihin acımasızlığına rağmen, " +
                        "mimari kimliğini korumayı başarmış bir ilçedir. İlçenin tarihi ve turistik yerlerinden biri, " +
                        "tarihe tanıklık etmiş ve mutlaka görülmeye değer tarihi evleridir. Ahşap evleri ile Arnavutköy, " +
                        "bu yönüyle Osmanlı başkentinin mimari çeşitliliği hakkında da ipuçları veriyor.1800’lü yılların " +
                        "sonunda büyük bir yangın çıktıktan sonra pek çok yapı yıkılmış olsa da hala tarihi binaları ile " +
                        "görülmeye değer ilçelerden biridir."

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("arnavutkoy")
                    Navigation.findNavController(it).navigate(action)

                }

            } else if (ilceAdi.equals("beyoglu")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text ="Beyoğlu'da Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.galatakulesi)
                binding!!.gezilecekBaslikText.text = "Galata Kulesi"
                binding!!.gezilecekAciklamaText.text = "Galata Kulesi ilk olarak Bizans İmparatoru Justinianos tarafından" +
                        " MS 507-508 yılında inşa edilmiştir. Günümüzdeki kuleyi 1348 - 49 yılında Cenevizliler yeniden " +
                        "inşa etmiştir. Kule 1445 - 46 yılları arasında yükseltilmiştir. 1500'lü yıllarda depremden " +
                        "zarar görerek, Mimar Murad bin Hayreddin tarafından onarılmıştır. III. Selim döneminde kule " +
                        "onarıldıktan sonra, kulenin üst katına bir cumba eklenir. 1831'de kule bir yangın daha geçirir," +
                        " II. Mahmut kulenin üzerine iki kat daha çıkar ve külah biçiminde olan ünlü dam örtüsüyle" +
                        " kulenin tepesi kapatılır. Yapı son olarak 1967'de onarım görmüştür. "

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("beyoglu")
                    Navigation.findNavController(it).navigate(action)

                }

            } else if (ilceAdi.equals("uskudar")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text ="Üsküdar'da Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.kizkulesi)
                binding!!.gezilecekBaslikText.text = "Kız Kulesi"
                binding!!.gezilecekAciklamaText.text = "Salacak açıklarındaki küçücük bir adanın üzerine " +
                        "inşa edilmiş olan Kız Kulesi, pek çok efsaneye konu olmaktadır. Bunlardan biri " +
                        "ve en bilineni, kuleye adını da vermiş olan Leandros efsanesidir. Fırtınalı bir " +
                        "gecede, Leondros, kulede ışık yandığını görünce sevgilisi Hero'nun kendisini" +
                        " çağırdığını düşünür ve denize atlar.  Oysaki bu kez ışığı yakan Hero değil, " +
                        "aşıkların her gece gizlice buluştuğunu anlayan bir başkasıdır ve ışığı söndürüverir. " +
                        "Leondros, boğazın dalgalarına gömülür; bunun acısına dayanamayan Hero ise kuleden " +
                        "atlayarak hayatına son verir. Efsanenin sonunda aşıklar adına kulenin olduğu yere " +
                        "bir deniz feneri yapılır. Tarihi MÖ 24 yılına dek uzanan Kız Kulesi, uzun tarihi " +
                        "boyunca savunma kalesi, sürgün istasyonu, hapishane, karantina odası, radyo istasyonu," +
                        " vergi noktası ve deniz feneri olarak kullanılmıştır."

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("uskudar")
                    Navigation.findNavController(it).navigate(action)

                }

            } else if (ilceAdi.equals("eminonu")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text = "Eminönü'nde Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.kapalicarsi)
                binding!!.gezilecekBaslikText.text = "Kapalı Çarşı"
                binding!!.gezilecekAciklamaText.text = "Türkiye’nin en büyük şehri İstanbul’da yer alan " +
                        "Kapalıçarşı’nın tarihi 15'inci yüzyılın ortalarına Fatih Sultan Mehmet Dönemi’ne " +
                        "kadar gider. Osmanlı kurumlarını ayakta tutan en önemli uygulamalardan olan vakıf " +
                        "sistemine göre camilerin tamir ve bakım masrafları gibi çeşitli ihtiyaçlarının " +
                        "karşılanabilmesi için gelir getirici bir başka yapı meydana getirilirdi. Bu gelir" +
                        " getirici yapıların en önemlileri çarşılar olup Fatih Sultan Mehmet tarafından" +
                        " Ayasofya’ya gelir getirmesi için inşa edilen yapılarla 1461 yılında Kapalıçarşı’nın " +
                        "da temeli atılmış ve yıllar içinde yapılan eklemelerle giderek büyümüştür. " +
                        "Zamanla tüm bölgenin en önemli ticari merkezi haline gelen, İstanbul’un en zengin " +
                        "esnaflarına ev sahipliği yapan, dünyanın her yerinden gelen mücevherlerin ve " +
                        "kıymetli takıların ticaretinin yapıldığı Kapalıçarşı, bu yıllarda bir banka ve" +
                        " finans merkezi gibi de hizmet vermiştir. "

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("eminonu")
                    Navigation.findNavController(it).navigate(action)

                }

            } else if (ilceAdi.equals("fatih")){

                binding!!.detaylarCardView.visibility = View.VISIBLE
                binding!!.detaylarCardView2.visibility = View.GONE
                binding!!.detaylarCardView3.visibility = View.GONE
                binding!!.detaylarCardView4.visibility = View.GONE

                binding!!.gezilecekYerlerinTarihcesiBaslik.text = "Fatih'te Gezilecek Yerler"
                binding!!.gezilecekImageView.setImageResource(R.drawable.ayasofya)
                binding!!.gezilecekBaslikText.text = "Ayasofya"
                binding!!.gezilecekAciklamaText.text = "İstanbul’da mutlaka görülmesi gereken yerlerden biri de " +
                        "Ayasofya Cami’dir. Ayasofya Cami Bizans imparatoru I. Justinian tarafından inşaa edilmiştir." +
                        " Bizans döneminde kilise olarak kullanılan Ayasofya, Osmanlı döneminde cami amacıyla " +
                        "kullanılmaya başlanmıştır. Günümüzde ise bir kısmı müze, bir kısmı ise cami olarak " +
                        "kullanılmaya devam edilmektedir. "

                binding!!.detayliBilgi.setOnClickListener {

                    val action = DetailsFragmentDirections.actionDetailsFragmentToDetailsFragment2("fatih")
                    Navigation.findNavController(it).navigate(action)
                }

            }





        }
    }


}