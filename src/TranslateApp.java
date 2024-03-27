import file.FileOperation;
import menu.ShowMenu;

import java.util.HashMap;
import java.util.Map;

public class TranslateApp {
    public static void main(String[] args) {

        try {
            String fileName = "words.txt";

            Map<String, String> words = new HashMap<>();
            words.put("About", "Haqqinda");
            words.put("Accept", "qebul et");
            words.put("Accessories", "Aksesuarlar");
            words.put("Action for long press", "Basili olaraq saxlayin");
            words.put("Active", "Aktiv");
            words.put("Add", "Elave et");
            words.put("Add device", "Cihaz elave et");
            words.put("Add Server", "Server elave et");
            words.put("Add shorcut", "Qisayol elave et");
            words.put("Add task", "Tapsiriq elave et");
            words.put("Added", "Elave edilib");
            words.put("Additional subtitle", "Uzerine yaz yaz");
            words.put("Adjustment", "Nizamlama");
            words.put("Apply to all", "Hamisi ucun tetbiq et");
            words.put("Are you sure", "Eminsiniz");
            words.put("Are you sure to delete it", "Silmek isteyirsiniz");
            words.put("Archive", "Arxiv");
            words.put("Ascending", "Artan");
            words.put("Attribute", "Xususiyyet");
            words.put("Attributes", "Atributlar");
            words.put("Audio", "Ses");
            words.put("Audio cable", "Ses cabeli");
            words.put("Audio channel", "Ses kanali");
            words.put("Audio not found", "Musiqi tapilmadi");
            words.put("Auto", "Ardicil");
            words.put("Auto save", "Avtomatik saxlama");
            words.put("AutoStartProgram", "Programi avtomatik baslat");
            words.put("Aviable", "Movcuddur");
            words.put("Azerbaijani", "Azerbaycan dili");
            words.put("Back", "Geri");
            words.put("Back to", "Cevir");
            words.put("Background", "Arxa fon");
            words.put("Background color", "Arxa fon rengi");
            words.put("Backup", "Ehtiyat nusxe");
            words.put("Back up", "Berpa et");
            words.put("Backing up", "Berpa edilir");
            words.put("Bad", "Pis");
            words.put("Balance", "Balans");
            words.put("Battery", "Batareya");
            words.put("Beta", "Sinaq");
            words.put("Beta version", "Sinaq versia");
            words.put("Bold", "Qalin");
            words.put("Boost", "Gunclendir");
            words.put("Bottom", "Sona get");
            words.put("Bottom left", "Asagi sol kuncde");
            words.put("Bottom right", "Asagi sag kuncde");
            words.put("Brightness", "Parlaqliq");
            words.put("Browser", "Fayl sistemi");
            words.put("Browsering history", "Tarixce");
            words.put("Build date", "Yaradilma tarixi");
            words.put("Button", "Duyme");
            words.put("Category", "katiqoria");
            words.put("Center", "Merkez");
            words.put("Certificate", "Sertifikat");
            words.put("Change", "Deyis");
            words.put("Character", "Simvol");
            words.put("Check", "Yoxla");
            words.put("Choose", "Sec");
            words.put("Choose folder", "Qovluq sec");
            words.put("Choose file", "Fayl sec");
            words.put("Clean", "Temizle");
            words.put("Clear", "Sil");
            words.put("Clear list", "Siyahini sil");
            words.put("Clear data", "Melumatlari sil");
            words.put("Click", "Bas");
            words.put("Click to install", "Yukle");
            words.put("Close others", "Hamisini bagla");
            words.put("Close tab", "Seifeni bagla");
            words.put("Close", "Bagla");
            words.put("Command", "Tapsiriq");
            words.put("Command line", "Emr setri");
            words.put("Compatible", "Desteklenir");
            words.put("Completing", "Tamamlanir");
            words.put("Failed", "Emeliyyat ugursuzdur");
            words.put("False", "Yalnis");
            words.put("Favorites", "Secilmisler");
            words.put("File", "Fayl");
            words.put("Files", "Fayllar");
            words.put("File already exists", "Fayl artiq movcuddur");
            words.put("File browser", "Fayl sistemi");
            words.put("File details", "Fayl detallari");
            words.put("File manager", "Fayl menecer");
            words.put("File name", "Fayl adi");
            words.put("File was modified", "Fayl artiq deyisdirilib");
            words.put("Filter", "Suzgec");
            words.put("Find", "Axtaris");
            words.put("Finish", "Bitdi");
            words.put("Finising", "Tamamlanir");
            words.put("Folder", "Qovluq");
            words.put("Forward", "Ireli");
            words.put("Edit", "Duzelis et");
            words.put("Empty", "Bos");
            words.put("Enable", "Aktiv");
            words.put("Encoding", "Kodlasdirilir");
            words.put("End Time", "Bitme vaxti");
            words.put("Error", "Xeta");
            words.put("Exit", "Cixis");
            words.put("Export", "Cixart");
            words.put("Data", "Melumat");
            words.put("Date", "Tarix");
            words.put("Deactive", "Qeyri aktiv");
            words.put("Default", "Standart");
            words.put("Delay", "Gecikme");
            words.put("Delete", "Sil");
            words.put("Deleting", "Silinir");
            words.put("Details", "Detallar");
            words.put("Device", "Qurgu");
            words.put("Disable", "Qeyri aktiv");
            words.put("Disabled", "Baglidir");
            words.put("Done", "Bitti");
            words.put("Down", "Asagi");
            words.put("Download", "Yukle");
            words.put("Downloads", "Yuklemeler");
            FileOperation.writeWordsToFile(words, fileName);

            ShowMenu menu = new ShowMenu();
            menu.setWords(FileOperation.readWords(fileName));
            menu.showMenuOptions();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
