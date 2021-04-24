/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wsid07;

/**
 *
 * @author HP
 */
public class MainTv {
    private final String deskripsi;
private final int jumlahChannel;
public String[] channel;
public int ChannelAktif;
public int volume;
     
     public MainTv(String deskripsi, int jumlahChannel) {
     this.deskripsi = deskripsi;
     this.jumlahChannel = jumlahChannel;
     }
     public String getDeskripsi() {
     return deskripsi;
     }
     public int getJumlahChannel() {
     return jumlahChannel;
     }
     public String[] getChannels() {
     if (channel == null) {
     System.out.println("Belum ada channel yang diset!");
     }
     return channel;
     }
     public void setChannels(String[] channels) {
     if (channels.length > jumlahChannel) {
          System.out.println("Maaf Tv ini hanya dapat menyimpan " +
                        jumlahChannel);
     }
     else {
          this.channel = channel;
          System.out.println("Informasi channel berhasil di update!");
     }
     }
     public int getChannelAktif() {
     return ChannelAktif;
     }
     public void setChannelAktif(int ChannelAktif) {
     if (ChannelAktif>channel.length) {
          System.out.println("Channel yang Anda inginkan belum diset!");
          return;
     }
     this.ChannelAktif = ChannelAktif;
     System.out.println("Pindah channel ke : " + channel[ChannelAktif]);
     }
     public int getVolume() {
     return volume;
     }
     public void setVolume(int volume) {
     this.volume = volume;
     System.out.println("intensitas volume sekarang : " + volume);
     }
    public static void main(String[] args) {
     MainTv tv = new MainTv("TV tempoe doeloe, 14 inches", 10);
     String[] semuaChannel = {"RCTI", "SCTV","INDOSIAR","LA TV",
                              "METRO TV","TRANS TV","TPI","TV 7","TVRI","TV G","AN TV"};
     String[] channelFavorit = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                "MTRO TV","TRANS TV","TPI","TV 7"};
     System.out.println("Pak Lukman membeli Televisi : " + tv.getDeskripsi());
     tv.getChannels();
     tv.setChannels(semuaChannel);
     tv.setChannels(channelFavorit);
     
     tv.setChannelAktif(3);
     tv.setVolume(10);
     tv.setChannelAktif(10);
     tv.setChannelAktif(1);
     }
}
