package pl.pwr.mnah.catalogue

import android.app.Application
import android.provider.Settings.Global.getString
import android.util.Log
import androidx.lifecycle.ViewModel

class ListViewModel() : ViewModel() {

    var filmsList : ArrayList<Film>

    init {
        filmsList = prepareFilm()
    }

    fun prepareFilm(): ArrayList<Film> {
        val names = arrayOf("Gwiezdne wojny", "Władca Pierścieni", "Skazani na Shawshang", "Szklana pułapka", "Twierdza",
                "Szybcy i wściekli", "Narzeczony mimo woli", "Armageddon")
        val categories = arrayOf("Fantasy", "Dramat", "SciFi", "Akcji", "Romantyczny")
        val imageId : IntArray =  intArrayOf(R.drawable.star_wars, R.drawable.lotr, R.drawable.shawshang,
                R.drawable.die_hard, R.drawable.rock, R.drawable.fast_and_furious, R.drawable.proposal, R.drawable.armageddon)

        val gallery_star_wars : IntArray =  intArrayOf(R.drawable.star_wars_1, R.drawable.star_wars_2,
                R.drawable.star_wars_3, R.drawable.star_wars_4)
        val gallery_lotr : IntArray =  intArrayOf(R.drawable.lotr_1, R.drawable.lotr_2,
                R.drawable.lotr_3, R.drawable.lotr_4)
        val gallery_shaw : IntArray =  intArrayOf(R.drawable.shaw_1, R.drawable.shaw_2,
                R.drawable.shaw_3, R.drawable.shaw_4)
        val gallery_die: IntArray =  intArrayOf(R.drawable.die_1, R.drawable.die_2,
                R.drawable.die_3)
        val gallery_rock: IntArray =  intArrayOf(R.drawable.rock_1, R.drawable.rock_2,
                R.drawable.rock_3, R.drawable.rock_4)
        val gallery_fast: IntArray =  intArrayOf(R.drawable.fast_1, R.drawable.fast_2,
                R.drawable.fast_3, R.drawable.fast_4)
        val gallery_proposal: IntArray =  intArrayOf(R.drawable.proposal_1, R.drawable.proposal_2,
                R.drawable.proposal_3)
        val gallery_arma : IntArray =  intArrayOf(R.drawable.arma_1, R.drawable.arma_2,
                R.drawable.arma_3)
        var Films : ArrayList<Film> = ArrayList(1)

        Films.add(Film(name = names[0], categories[2], imageId[0], false,
            "Od ostatecznej bitwy Rebeliantów z Imperium minęło trzydzieści lat, Luke " +
                    "Skywalker (Mark Hamill) znika bez śladu. Na gruzach pokonanego Imperium Zła " +
                    "wyrósł Najwyższy Porządek, którego celem jest przejęcie władzy nad Galaktyką. " +
                    "Plany może mu pokrzyżować Ruch Oporu, na czele którego stoi siostra Skywalkera, " +
                    "Leia Organa (Carrie Fisher). Generał Organa postanawia wysłać w niebezpieczną misję " +
                    "na planetę Jakku swojego najlepszego pilota Poe Damerona (Oscar Isaac), który " +
                    "wpada jednak w ręce złowrogiego Kylo Rena (Adam Driver). W ostateczną rozgrywkę " +
                    "między członkami Ruchu Oporu a Najwyższym Porządkiem nieoczekiwanie zostaje " +
                    "wplątana Rey (Daisy Ridley), obdarzona niezwykłymi umiejętnościami młoda dziewczyna." +
                    "Siódmy epizod kultowej sagi George’a Lucasa to pełna adrenaliny i dynamicznych " +
                    "zwrotów akcji opowieść o odległej Galaktyce, w której walczą ze sobą Jasna i " +
                    "Ciemna Strona Mocy. Obok bohaterów znanych z poprzednich części, Hana Solo " +
                    "(Harrison Ford), Luke’a Skywalkera (Mark Hamill) czy Księżniczki Lei (Carrie Fisher), " +
                    "w Przebudzeniu Mocy pojawiają się przedstawiciele nowego pokolenia, którzy " +
                    "nie pamiętają zwycięstwa Rebelii nad Galaktycznym Imperium. Wśród nich są " +
                    "zbuntowany szturmowiec Finn oraz obdarzona Mocą Rey - w tych rolach John Boyega " +
                    "(Atak na dzielnicę) i Daisy Ridley (Scrawl). Perfekcyjnie zrealizowany obraz " +
                    "odniósł ogromny sukces u publiczności, stając się jednym z najbardziej kasowych " +
                    "filmów w historii kina. Zdobył też wiele nagród i prestiżowych wyróżnień, " +
                    "w tym m.in. pięć nominacji do Oscara (m.in. za muzykę Johna Williamsa, montaż " +
                    "oraz efekty specjalne) oraz osiem statuetek Saturna. Reżyserem i współautorem " +
                    "scenariusza jest J.J. Abrams (serial Zagubieni), twórca współczesnej kinowej " +
                    "wersji serialu Star Trek.",
                arrayOf("Harrison Ford", "Mark Hamill", "Carrie Fisher", "Adam Driver", "Daisy Ridley",
                    "John Boyega", "Oscar Isaac", "Lupita Nyong'o", "Andy Serkis"),
            gallery_star_wars))
        Films.add(Film(name = names[1], categories[0], imageId[1], false,
            "Kiedyś, na pamiętnej wyprawie pod Samotną Górę Bilbo Baggins zdobył przez " +
                    "przypadek tajemniczy Pierścień. Jeden z jego starych dobrych znajomych, " +
                    "który także uczestniczył w tamtej wyprawie - czarodziej Gandalf, " +
                    "zaczyna teraz podejrzewać, że jest to Jedyny Pierścień, który może dać " +
                    "władzę nad światem. Został on dawno temu stworzony przez Saurona we wnętrzu " +
                    "Góry Zagłady i teraz jego twórca chce go odzyskać, by zrealizować swoje " +
                    "niebezpieczne plany. Frodo Baggins, który otrzymał ten pierścień od Bilba, " +
                    "musi uciekać. Na naradzie w Rivendell zostaje podjęta decyzja, że drużyna " +
                    "złożona z dziewięciu przedstawicieli różnych ras, podejmie się razem z " +
                    "Frodem - Powiernikiem Pierścienia wykonać misję zniszczenia potężnego " +
                    "pierścienia. W Śródziemiu zanosi się na wojnę. Robi się niebezpiecznie, " +
                    "pojawiają się tajemniczy Czarni Jeźdźcy. Losy tej wojny nie będą jednak " +
                    "zależeć tak naprawdę od rozkładu sił militarnych. Wszystkie wojska będą " +
                    "jedynie przykrywką, losy świata zależą od Drużyny Pierścienia i od tego, " +
                    "czy Powiernik Pierścienia ukończy szczęśliwie swoją misję; jest to o tyle " +
                    "trudniejsze, że Pierścień Władzy budzi silne pożądanie w ludziach, " +
                    "którzy się z nim stykają i potrafi zawładnąć ich psychiką, jeśli nie " +
                    "będą wystarczająco odporni. W ślad za Drużyną rusza między innymi " +
                    "jedna z ofiar Pierścienia Władzy - Gollum, który posunie się do " +
                    "wszystkiego by odzyskać Pierścień, który kiedyś zrujnował " +
                    "jego życie i zrobił z niego potwora.",
            arrayOf("Elijah Wood", "Sean Astin", "Billy Boyd", "Dominic Monaghan", "Ian Holm",
                "Viggo Mortensen", "Ian McKellen", "Liv Tyler", "Orlando Bloom"),
                gallery_lotr))
        Films.add(Film(name = names[2], categories[1], imageId[2], false,
            "Głównym bohaterem filmu jest Andy Dufresne (Tim Robbins) - dobrze zarabiający" +
                    " bankier, który zostaje oskarżony o zamordowanie swojej żony i jej kochanka." +
                    " Mężczyzna nie ma bowiem alibi, za to posiadał broń i motyw. Zostaje skazany " +
                    "na dożywocie i trafia do Shawshank - więzienia, które słynie z surowych zasad i " +
                    "rygoru. Już po pierwszej dobie w nowym miejscu orientuje się, że wszystkim rządzi" +
                    " fanatyk religijny - naczelnik Norton (Bob Gunton). Pewnego dnia Dufresne staje " +
                    "się świadkiem rozmowy dotyczącej opodatkowania spadku, który dostał jeden ze " +
                    "strażników. Andy postanawia wykorzystać sytuację i doradza mężczyźnie jak " +
                    "zachować całą sumę pieniędzy. Andy po czasie pracuje w więzieniu jako doradca " +
                    "podatkowy i zajmuje się praniem brudnych pieniędzy naczelnika. " +
                    "Zdobywa jego zaufanie co pozwala mu się zbliżyć do zarządcy i otrzymywać " +
                    "korzyści z tej znajomości. Pewnego dnia Andy prosi Reda, aby przemycił dla " +
                    "niego mały młoteczek. Dufresne wkrótce otrzymuje to narzędzie, " +
                    "którego z początku używa do rzeźbienia figurek szachowych w " +
                    "znalezionych minerałach. Potajemnie przechowuje je w egzemplarzu Biblii z wyciętą" +
                    " dziurą na młotek. Kiedy okazuje się że ściana w jego celi jest dość krucha, aby drążyć" +
                    " w niej dziurę, pod osłoną nocy zaczyna kopać tunel, aby wydostać się z więzienia. " +
                    "W międzyczasie dokonuje oszustwa i wszystkie pieniądze z czarnych interesów naczelnika" +
                    " przelewa na konto wyimaginowanej osoby. Wkrótce udaje mu się uciec przez wydrążoną " +
                    "w ścianie celi dziurę, przelać pieniądze na nowe konto i zyskać nową tożsamość.",
            arrayOf("Tim Robbins", "Morgan Freeman", "Bob Gunton", "William Sadler", "Clancy Brown",
                "Gil Bellows", "Mark Rolston", "James Whitmore", "Larry Brandenburg"),
                gallery_shaw))
        Films.add(Film(name = names[3], categories[3], imageId[3], false,
            "Nowojorski detektyw John McClane (Bruce Willis) przybywa w wigilię Bożego " +
                    "Narodzenia do Los Angeles, by spędzić święta razem z żoną. Odkąd Holly ]" +
                    "(Bonnie Bedelia) postanowiła robić karierę w amerykańskiej filii japońskiej firmy," +
                    " drogi obojga się rozeszły. John, który nie chciał rezygnować z pracy i " +
                    "przenosić się razem z żoną do Kalifornii, widuje się z Holly coraz rzadziej " +
                    "i te święta wydają się być ostatnią okazją do poprawy stosunków między " +
                    "małżonkami i poukładania wspólnych spraw, choćby i ze względu na dwójkę dzieci." +
                    " Johna po przybyciu do nowoczesnego, zbudowanego ze stali i szkła wieżowca " +
                    "Nakatomi, siedziby firmy Holly, czeka pierwsza niemiła niespodzianka. Na recepcji" +
                    " odkrywa, że żona używa w pracy swojego panieńskiego nazwiska, co według niego " +
                    "jednoznacznie oznacza, że z ich związkiem jest jeszcze gorzej niż myślał. " +
                    "Spotkana chwilę później żona tłumaczy taką decyzję wymogiem japońskich zwyczajów," +
                    " wedle których mężatki traktowane są inaczej niż kobiety wolne. Holly, " +
                    "która ma do załatwienia jeszcze kilka spraw, zostawia męża, by odpoczął po podróży" +
                    " i wkrótce mają się spotkać i rozmówić. Nie będzie jednak ku temu okazji, " +
                    "bo niespodziewanie w Nakatomi pojawia się grupa uzbrojonych mężczyzn pod dowództwem" +
                    " charyzmatycznego Hansa Grubera (Alan Rickman), którzy podają się za terrorystów " +
                    "i wysuwają żądania uwolnienia przez rząd podobnych im bojowników osadzonych w " +
                    "amerykańskich więzieniach. Szybko opanowują budynek i biorą pracowników firmy " +
                    "jako zakładników.",
            arrayOf("Bruce Willis", "Alan Rickman", "Bonnie Bedelia", "Reginald VelJohnson",
                "Paul Gleason", "De'voreaux White", "William Atherton", "Hart Bochner", "James Shigeta"),
                gallery_die))
        Films.add(Film(name = names[4], categories[3], imageId[4], false,
            "Zdesperowany generał Hummel (Ed Harris) ze swoim doborowym oddziałem " +
                    "przejmuje kontrolę nad najsławniejszym więzieniem świata - Alcatraz, biorąc jako" +
                    " zakładników zwiedzających je turystów i skierowując głowice z bronią chemiczną" +
                    " na San Francisco. Miliony istnień wiszą na włosku. Jego szaleństwo ma swoją " +
                    "przyczynę: pragnie bowiem uzyskać od rządu okup 100.000.000 dolarów, a pieniądze" +
                    " przekazać rodzinom zamordowanych w tajnych operacjach żołnierzy. Rząd wysyła " +
                    "przeciw Hummelowi tylko dwóch ludzi - Jasona Patricka Masona (Connery) - " +
                    "jedynego z żyjących więźniów, któremu powiodła się ucieczka, z tej niedostępnej" +
                    " twierdzy i specjalistę od broni chemicznej Stanleya Goodspeeda (Cage). " +
                    "W krętym labiryncie korytarzy Alcatraz rozgrywa się śmiertelny wyścig z czasem," +
                    " którego stawką jest życie wszystkich mieszkańców San Francisco.",
            arrayOf("Sean Connery", "Nicolas Cage", "Ed Harris", "William Forsythe", "David Morse",
                "Michael Biehn", "John Spencer", "Vanessa Marcil", "John C. McGinley"),
                gallery_rock))
        Films.add(Film(name = names[5], categories[3], imageId[5], false,
            "Szybcy i wściekli to dynamiczna historia osadzona w Los Angeles, w realiach" +
                    " bezwzględnego świata nielegalnych wyścigów samochodowych, w których zwycięstwo" +
                    " oznacza klucz do władzy. Paul Walker wciela się w postać Briana, młodego" +
                    " policjanta prowadzącego śledztwo w sprawie serii sensacyjnych porwań ciężarówek." +
                    " Przenika do drużyny charyzmatycznego Dominica (Vin Diesel) - jednego z głównych" +
                    " podejrzanych. Tymczasem ten niebezpieczny, kipiący adrenaliną świat coraz " +
                    "bardziej fascynuje Briana. Wkrótce nadchodzi moment, kiedy musi podjąć decyzję," +
                    " komu pozostanie lojalny.",
            arrayOf("Vin Diesel", "Paul Walker", "Jordana Brewster", "Michelle Rodriguez",
                "R.J. de Vera", "Rick Yune", "Chad Lindberg", "Johnny Strong", "Matt Schulze"),
                gallery_fast))
        Films.add(Film(name = names[6], categories[4], imageId[6], false,
            "Bohaterka filmu „Narzeczony mimo woli” („The Proposal”) Margaret Tate " +
                    "(Sandra Bullock) to redaktor naczelna wydawnictwa książkowego, której grozi " +
                    "deportacja ze Stanów Zjednoczonych. Pochodząca z Kanady Margaret złamała warunki" +
                    " swojej wizy pracowniczej i teraz zostaje zmuszona do ekspresowego rozwiązania " +
                    "problemu. Takim rozwiązaniem może być ślub ze swoim asystentem Andrewem Paxtonem " +
                    "(Ryan Reynolds). Kartą przetargową w negocjacjach z Paxtonem jest to, że jeśli " +
                    "Margaret zostanie deportowana, wtedy on straci pracę. Będzie się też mógł pożegnać" +
                    " z marzeniami o zostaniu redaktorem. Wśród wielu problemów stojących na drodze " +
                    "do szybkiego małżeństwa jest to, że Paxton nie przepada za swoją szefową, która " +
                    "była dla niego wyjątkowo niemiła. Na dodatek oszustwo węszy agent urzędu " +
                    "imigracyjnego Gilbertson (Denis O’Hare). Za kilka dni zamierza przesłuchać " +
                    "osobno Margaret i Andrewa ze znajomości partnera i jeśli ich odpowiedzi nie " +
                    "będą się zgadzać, to Margaret zostanie wydalona do Kanady bez możliwości powrotu." +
                    " Andrewa czeka zaś pięć lat odsiadki i ćwierć miliona dolarów grzywny. Zgadza się" +
                    " jednak na propozycję szefowej pod warunkiem, że wyda książkę, którą jej " +
                    "zarekomenduje. Czas pozostały do przesłuchania narzeczeni zamierzają wykorzystać" +
                    " na bliższe poznanie się. W tym celu wybierają się na Alaskę, by spotkać się z " +
                    "rodziną Andrewa: mamą Grace (Mary Steenburgen), ojcem Joem (Craig T. Nelson) " +
                    "oraz babcią Annie (Betty White).",
            arrayOf("Sandra Bullock", "Ryan Reynolds", "Mary Steenburgen", "Craig T. Nelson",
                "Betty White", "Denis O'Hare", "Malin Akerman", "Oscar Nuñez", "Aasif Mandvi"),
                gallery_proposal))
        Films.add(Film(name = names[7], categories[2], imageId[7], false,
            "Kosmiczny prom Atlantis zostaje zniszczony w kosmosie przez rój meteorytów," +
                    " które spadają na Ziemię. Zajmujący się sprawą naukowcy NASA odkrywają," +
                    " że to jedynie zapowiedź o wiele większej katastrofy. Do Ziemi zbliża się bowiem" +
                    " ogromna asteroida wielkości stanu Teksas. Dottie, bo tak została nazwana " +
                    "przez jej odkrywcę, zderzy się z Ziemią już za osiemnaście dni, a skutki tego" +
                    " zderzenia będą katastrofalne. Ludzkości grozi wyginięcie. Szybko opracowany " +
                    "zostaje plan ratunkowy. Jego twórcą jest pracujący w NASA Dan Truman (Billy " +
                    "Bob Thornton). Plan Trumana zakłada umieszczenie na asteroidzie ładunku " +
                    "nuklearnego, którego detonacja rozpłata asteroid na dwie części. Dzięki temu" +
                    " przy odrobinie szczęścia obie połówki ominą Ziemię w bezpiecznej odległości." +
                    " Aby do tego doszło, konieczne jest jednak wywiercenie w asteroidzie głębokiego" +
                    " na prawie 250 metrów otworu, w którym umieszczona zostanie bomba. Do wykonania" +
                    " tego zadania wybrany zostaje Harry Stamper (Bruce Willis), specjalista od " +
                    "odwiertów ropy naftowej pracujący na jednej z platform wiertniczych. Harry " +
                    "wymusza na NASA, by pozwolono mu skompletować własną załogę złożoną z " +
                    "zaufanych i doświadczonych ludzi, na których będzie mógł polegać w " +
                    "trakcie odwiertu na asteroidzie. Wśród nich jest między innymi młody " +
                    "i narwany A. J. Frost (Ben Affleck), chłopak córki Sampera, Grace " +
                    "(Liv Tyler). Po przejściu szybkiego treningu w kosmos wysłane zostają dwa" +
                    " wahadłowce: Freedom i Independence. Zmierzając w stronę asteroidy w pierwszej" +
                    " kolejności zatrzymują się na stacji kosmicznej Mir, by tam uzupełnić zapasy" +
                    " tlenu. Szybko pojawiają się pierwsze problemy, a czas ucieka.",
            arrayOf("Bruce Willis", "Billy Bob Thornton", "Liv Tyler", "Ben Affleck", "Will Patton",
                "Steve Buscemi", "Peter Stormare", "Owen Wilson", "Chris Ellis"),
                gallery_arma))


        return Films
    }
}