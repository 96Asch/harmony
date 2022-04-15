import internal from "stream";

type HarmonyData = UserRegister | UserLogin | Song | {};
type RequestType = "POST" | "GET" | "DELETE";

export interface UserRegister {
    username: string;
    password: string;
    email   : string;
}

export interface UserLogin {
    username: string;
    password: string;
}

export interface Song {
    title           : string;
    subtitle        : string;
    bpm             : number;
    key             : string;
    timeSignature1  : number;
    timeSignature2  : number;
    genre           : string;
    chordRaw        : string;
    refTrack        : File;
    owner           : string; 
    public          : boolean;
}

export interface Notification {
    sender   : string;
    message  : string;
    dateSent : Date;
    toJoin   : string;
    isAdmin  : boolean;
}


export function Dao(request : RequestType, data : HarmonyData) {
    const dao = { 
                    method : request,
                    message : data
                }
    return dao;
}
