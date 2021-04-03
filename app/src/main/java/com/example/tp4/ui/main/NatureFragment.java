package com.example.tp4.ui.main;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.tp4.R;

public class NatureFragment extends Fragment {
    // Les champs utilisés par chaque Fragment
    //Ils sont distincts pour chaque NatureFragment instancié
    private String title;
    private int page;
    /**
     * Pour la sauvegarde et la récupération des données
     * dans un Bundle
     */
    private static final String ARG_SECTION_NUMBER = "numero_page";
    private static final String ARG_SECTION_TITLE = "titre_page";
    /**
     * Retourne une nouvelle instance de ce fragment
     * pour le numéro de section donné.
     */
    public static NatureFragment newInstance(int position, String title) {
        NatureFragment fragment = new NatureFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, position);
        args.putString(ARG_SECTION_TITLE, title);
        fragment.setArguments(args);
        return fragment;
    }
    // retrouver les valeurs des champs à partir du bundle
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt(ARG_SECTION_NUMBER, 0);
        title = getArguments().getString(ARG_SECTION_TITLE);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        TextView tvLabel = (TextView) view.findViewById(R.id.section_label);
        if (page==0){tvLabel.setText("Un minéral est un élément ou un composé chimique qui est normalement cristallin et qui s'est formé suite à un processus géologique. Il peut être décrit, dans la très grande majorité des cas, comme une matière cristallisée caractérisée par sa composition chimique et l'agencement de ses atomes selon une périodicité et une symétrie précises qui se reflètent dans le système cristallin et le groupe d'espace du minéral1.\n" +
                "\n" +
                "Par exception historique à l'état solide, le mercure, liquide à température ambiante (il ne forme un cristal qu'en dessous de −39 °C), est aussi considéré comme un minéral de la catégorie des éléments natifs. Quelques solides non cristallisés et amorphes, telles l'opale (minéraloïde composé de différentes phases de silice, assimilable à une roche) et l'ambre (roche organique issue de coulée de sève fossilisée), sont aussi considérés par tradition comme des minéraux, alors que les verres naturels sont exclus. ");}
        if (page==1){tvLabel.setText("Selon les classifications scientifiques classiques un végétal est un organisme appartenant à l'une des diverses lignées qui végètent : c'est-à-dire qui respirent, se nourrissent, croissent comme les plantes, selon l'étymologie du terme1. Contrairement à une idée largement répandue, le terme végétal ne désigne pas uniquement les plantes. Si l'on définit les plantes comme l'ensemble des organismes couramment reconnus comme les « végétaux verts », elles forment un groupe monophylétique comprenant les algues vertes et les plantes terrestres, constituant le taxon des Chlorobiontes. À ceux-ci, on rajoute les algues rouges, les algues brunes, ainsi que les champignons, pour former les végétaux, au sens « commun ». Toutefois, au sens de la phylogénétique, et dans les classifications modernes, le « règne végétal » avec son contenu traditionnel n'existe plus, dispersé dans plusieurs clades séparés, et le « végétal » est désormais un terme trop vague2,3,4,5 qui tend à ne plus être employé en botanique");}
        if (page==2){tvLabel.setText("Les Animaux (Animalia) (du latin animalis « animé, vivant, animal ») sont en biologie, selon la classification classique, des êtres vivants hétérotrophes, c’est-à-dire qui se nourrissent de substances organiques. On réserve aujourd'hui le terme « animal » à des êtres complexes et multicellulaires, bien qu’on ait longtemps considéré les protozoaires comme des animaux unicellulaires. Comme les autres êtres vivants, tout animal a des semblables avec qui il forme un groupe homogène, appelé espèce.\n" +
                "\n" +
                "Dans les classifications scientifiques modernes, le taxon des animaux se nomme Animalia (création originale de Linné en 1758, eu égard au Code international de nomenclature zoologique (CINZ) ou encore Metazoa (synonyme junior créé par Haeckel en 1874). Quel que soit le terme employé ou quelle que soit la classification retenue (évolutionniste ou cladiste), les animaux sont consensuellement décrits comme des organismes eucaryotes pluricellulaires généralement mobiles et hétérotrophes.\n" +
                "\n" +
                "Dans le langage courant, les termes « animal » ou « bête » sont souvent utilisés pour distinguer le reste du monde animal des humains. Le langage courant diffère également du biologique par le fait que « animal » renvoie souvent à une certaine taille qui exclut entre autres les insectes. Enfin, il peut être utilisé en opposition à « végétal », terme qui regroupe les plantes, les algues et les champignons.\n" +
                "\n" +
                "La science consacrée à l'étude du règne animal est la zoologie. ");}

        return view;
    }
}