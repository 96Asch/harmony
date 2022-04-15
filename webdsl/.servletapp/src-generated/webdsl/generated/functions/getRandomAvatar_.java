package webdsl.generated.functions;
@SuppressWarnings("all")public class getRandomAvatar_{
public static String getRandomAvatar_(){
java.util.List<String> urls_=webdsl.generated.functions.getAvatarURLs_.getAvatarURLs_();
return (String)urls_.get(java.util.concurrent.ThreadLocalRandom.current().nextInt(urls_.size()));
}
}
