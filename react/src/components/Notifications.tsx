import React, { useEffect, useState } from 'react'
import { useHarmony } from '../models/Provider'

export default function Notifications() {

    const { state } = useHarmony();
    const [notifications, setNotifications] = useState<Notification>()

    useEffect(() => {
        
    }, [])

    return (
        <div>Notifications</div>
    )
}
