module entities

section enum

enum NotificationType {
  warning("Warning"),
  invitation("Invite"),
  error("Error")
}

enum SongKey {
  C("C"),
  CS("C#"),
  D("D"),
  DF("Db"),
  DS("D#"),
  E("E"),
  EF("Eb"),
  F("F"),
  FS("F#"),
  G("G"),
  GF("Gb"),
  GS("G#"),
  A("A"),
  AF("Ab"),
  AS("A#"),
  B("B"),
  BF("Bb")
}

section session

session tempFormData {
  
  users : {User}
  admins : {User}
  songs : [Song]
  pending : {User}
  setlists : {SetList}
  
  function clear() {
    users.clear();
    admins.clear();
    songs.clear();
    pending.clear();
    setlists.clear();
    log("cleared temp");
  }
}

session apiSession {
  token : String
  user  : User
}

section entity

entity User {
  username : String(id, name, iderror = "Username is already in use", idemptyerror = "Username is required", searchable)
  email : Email (searchable)
  password : Secret (  
    validate(password.length() >= 8, "Password needs to be at least 8 characters"))
  
  
  function toJSON() : JSONObject {
    var json := JSONObject();
    json.put("username", username);
    json.put("email", email);
    return json;
  }
}

entity Song {
  title : String (searchable, name)
  subtitle : String
  bpm : Int
  key : SongKey
  timeSignature1 : Int
  timeSignature2 : Int
  genre : String
  chordRaw : Text
  refTrack : File
  owner : User 
  public : Bool
  
  function toTruncJSON() : JSONObject {
    var json := JSONObject();
    json.put("title", title);
    json.put("uuid", id);
    return json;
  }
}

entity SetList {
  title : String (searchable, name)
  // Owner can add/remove members and make admins
  owner : User
  description : Text
  songs : [Song]
  // Admins can add/remove songs in the setlist
  admins : {User}
  members : {User}
  // Invited users pending acceptance
  pending : {User}
  deadline: Date
  
  function toTruncJSON() : JSONObject {
    var json := JSONObject();
    json.put("title", title);
    json.put("description", description);
    json.put("owner", owner.username);
    json.put("uuid", id);
    return json;
  }
  
  function toJSON() : JSONObject {
    var json := JSONObject();
    json.put("title", title);
    json.put("owner", owner.username);
    json.put("description", description);
    
    var jsonSongs := JSONArray();
    for (song in songs) {
      jsonSongs.put(song.toTruncJSON());
    }
    json.put("songs", jsonSongs);
    
    var jsonAdmins := JSONArray();
    for (admin in admins) {
      jsonAdmins.put(admin.toJSON());
    }
    json.put("admins", jsonAdmins);
    
    var jsonMembers := JSONArray();
    for (member in members) {
      jsonMembers.put(member.toJSON());
    }
    json.put("members", jsonMembers);
    
    var jsonPending := JSONArray();
    for (p in pending) {
      jsonPending.put(p.toJSON());
    }
    json.put("members", jsonPending);
    
    json.put("deadline", deadline.format("yyyy.MM.dd"));
    return json;
  }
  
}

entity Notification {
  sender : User
  receiver : User
  type : NotificationType
  message : String
  dateSent : Date
  
  function toJSON() : JSONObject {
    var json := JSONObject();
    json.put("uuid", id);
    json.put("sender", sender.username);
    json.put("receiver", receiver.username);
    json.put("type", type.name);
    json.put("dateSent", dateSent.format("yyyy.MM.dd"));
    return json;
  }
}

entity SetListInvitation : Notification {
  toJoin : SetList
  isAdmin : Bool
  
  function toJSON() : JSONObject {
    var json := JSONObject();
    json.put("uuid", id);
    json.put("sender", sender.username);
    json.put("receiver", receiver.username);
    json.put("type", type.name);
    json.put("dateSent", dateSent.format("yyyy.MM.dd"));
    json.put("toJoin", toJoin.title);
    json.put("isAdmin", isAdmin);
    return json;
  }
}

section localfiles

service expire-cache getAvatarURLs() {
  var avatarArray := JSONArray();
  
  var drums := JSONObject("{}");
  drums.put("url", "/images/avatar/drums.png");
  avatarArray.put(drums);
  
  var eg := JSONObject("{}");
  eg.put("url", "/images/avatar/eg.png");
  avatarArray.put(eg);
  
  var guitar := JSONObject("{}");
  guitar.put("url", "/images/avatar/guitar.png");
  avatarArray.put(guitar);
  
  var mic := JSONObject("{}");
  mic.put("url", "/images/avatar/microphone.png");
  avatarArray.put(mic);
  
  var piano := JSONObject("{}");
  piano.put("url", "/images/avatar/piano.png");
  avatarArray.put(piano);
  
  var sax := JSONObject("{}");
  sax.put("url", "/images/avatar/saxophone.png");
  avatarArray.put(sax);
  
  return avatarArray;
}

function getAvatarURLs() : [String] {
  return [
    "/images/avatar/drums.png",
    "/images/avatar/eg.png",
    "/images/avatar/guitar.png",
    "/images/avatar/microphone.png",
    "/images/avatar/piano.png",
    "/images/avatar/saxophone.png"
  ];
}

function getRandomAvatar() : String {
  var urls := getAvatarURLs();  
  return urls.random();
  
}
