package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Katak;
import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kupu;
import simple.example.hewanpedia.model.Semut;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Katak> initDataKatak(Context ctx) {
        List<Katak> kataks = new ArrayList<>();
        kataks.add(new Katak(ctx.getString(R.string.batu_nama),ctx.getString(R.string.batu_asal),
                ctx.getString(R.string.batu_deskripsi), R.drawable.kodok1));
        kataks.add(new Katak(ctx.getString(R.string.bertanduk_nama), ctx.getString(R.string.bertanduk_asal),
                ctx.getString(R.string.bertanduk_deskripsi), R.drawable.kodok2));
        kataks.add(new Katak(ctx.getString(R.string.mulut_sempit_nama),ctx.getString(R.string.mulut_sempit_asal),
                ctx.getString(R.string.mulut_sempit_deskritpsi), R.drawable.kodok3));
        return kataks;
    }


    private static List<Kupu> initDataKupu(Context ctx) {
        List<Kupu> kupus = new ArrayList<>();
        kupus.add(new Kupu(ctx.getString(R.string.Milbert_tortoiseshell_butterfly_nama),ctx.getString(R.string.Milbert_tortoiseshell_butterfly_asal),
                ctx.getString(R.string.Milbert_tortoiseshell_butterfly_deskripsi),R.drawable.kupu1));
        kupus.add(new Kupu(ctx.getString(R.string.Zebra_Swallowtail_nama), ctx.getString(R.string.Zebra_Swallowtail_asal),
                ctx.getString(R.string.Zebra_Swallowtail_deskripsi),R.drawable.kupu2));
        kupus.add(new Kupu(ctx.getString(R.string.Red_Admiral_nama), ctx.getString(R.string.Red_Admiral_asal),
                ctx.getString(R.string.Red_Admiral_deskripsi), R.drawable.kupu3));
        kupus.add(new Kupu(ctx.getString(R.string.Monarch_nama),ctx.getString(R.string.Monarch_asal),
                ctx.getString(R.string.Monarch_deskripsi), R.drawable.kupu4));
        return kupus;
    }
    private static List<Semut> initDataSemut(Context ctx) {
        List<Semut> semuts = new ArrayList<>();
        semuts.add(new Semut(ctx.getString(R.string.Tukang_kayu_nama), ctx.getString(R.string.Tukang_kayu_asal),
                ctx.getString(R.string.Tukang_kayu_deskripsi), R.drawable.semut1));
        semuts.add(new Semut(ctx.getString(R.string.semut_gila_nama),ctx.getString(R.string.semut_hantu_asal),
                ctx.getString(R.string.semut_gila_deskripsi), R.drawable.semut2));
        semuts.add(new Semut(ctx.getString(R.string.semut_hantu_nama),ctx.getString(R.string.semut_hantu_asal),
                ctx.getString(R.string.semut_hantu_deskripsi), R.drawable.semut3));
        semuts.add(new Semut(ctx.getString(R.string.Firaun_nama),ctx.getString(R.string.Firaun_asal),
                ctx.getString(R.string.Firaun_deskripsi), R.drawable.semut4));

        return semuts;
    }


    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKatak(ctx));
        hewans.addAll(initDataSemut(ctx));
        hewans.addAll(initDataKupu(ctx));
    }
    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}