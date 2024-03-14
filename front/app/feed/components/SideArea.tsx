"use client";

import { ScrollArea } from "@radix-ui/react-scroll-area";
import { Separator } from "@radix-ui/react-separator";

import Calendar from "@/public/icons/calendar/calendar-100.png";
import Help from "@/public/icons/help/help-100.png";
import Teach from "@/public/icons/teach/teach-100.png";
import Image from "next/image";

import { usePathname } from "next/navigation";
import Link from "next/link";

import { cn } from "@/lib/utils";

export default function SideArea() {

    const pathname = usePathname();
    

    // pathname === "/feed/help" ? "flex items-center justify-between p-2 bg-primary" : "flex items-center justify-between p-2"
    return (
        <ScrollArea className="h-[calc(100vh-60px)]  overflow-scroll w-[18rem] rounded-md border">
            <div>
                <Link href={"/feed/help"}>
                    <div className={cn("flex items-center justify-between p-2", {
                        "bg-primary": pathname === "/feed/help"
                    })}>
                        <Image src={Help} alt="help" className="w-14"/>
                        <p className="leading-7">Get Help</p>
                    </div>
                </Link>
                <Separator className="border-spacing-1 border-b border-gray-200" />
                <Link href={"/feed/teach"}>
                    <div className={cn("flex items-center justify-between p-2", {
                        "bg-primary": pathname === "/feed/teach"
                    })}>
                        <Image src={Teach} alt="teach" className="w-14" />
                        <p className="leading-7">Help Someone</p>
                    </div>
                </Link>
                <Separator className="border-spacing-1 border-b border-gray-200" />
                <Link href={"/feed/availability"}>
                    <div className={cn("flex items-center justify-between p-2", {
                        "bg-primary": pathname === "/feed/availability"
                    })}>
                        <Image src={Calendar} alt="calendar" className="w-14" />
                        <p className="leading-7">Student Posts</p>
                    </div>
                </Link>
                <Separator className="border-spacing-1 border-b border-gray-200" />
            </div>
        </ScrollArea>
    )
}