import axios, { AxiosInstance } from 'axios'
import React, { createContext, ReactNode, useContext, useReducer } from 'react'

export type Action = { type: 'updateUser', username: string, token: string } | { type: 'removeUser' } | { type: 'setAPI', baseUrl: string }
type Dispatch = (action: Action) => void
type State = { api: AxiosInstance | null, username: string, isLoggedIn: boolean, token: string }
type HarmonyProviderProps = { children: ReactNode }

const HarmonyContext = createContext<{ state: State; dispatch: Dispatch } | undefined>(undefined)

function harmonyReducer(state: State, action: Action): State {
	switch (action.type) {
		case 'updateUser': {
			return { ...state, username: action.username, isLoggedIn: true, token: action.token };
		}
		case 'removeUser': {
			return { ...state, username: '', isLoggedIn: false, token: '' };
		}
		case 'setAPI': {
			return { ...state, api: axios.create({baseURL: action.baseUrl}) }
		}
		default: {
			throw new Error(`action not recognized`);
		}
	}
}

function HarmonyProvider({ children }: HarmonyProviderProps) {
	const [state, dispatch] = useReducer(harmonyReducer, {api: null, username: '', isLoggedIn: false, token: '' })
	const value = { state, dispatch };
	return (
		<HarmonyContext.Provider value={value}>
			{children}
		</HarmonyContext.Provider>
	)
}

function useHarmony() {
	const context = useContext(HarmonyContext);
	if (context === undefined) {
		throw new Error('context was undefined');
	}
	return context;
}


export { HarmonyProvider, useHarmony } 
