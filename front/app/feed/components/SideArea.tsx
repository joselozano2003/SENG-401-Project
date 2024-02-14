"use client";

import { ScrollArea } from "@radix-ui/react-scroll-area";
import { Separator } from "@radix-ui/react-separator";
import { StaticImageData } from "next/image";

import Calendar from "@/public/icons/calendar/calendar-50.png";
import Help from "@/public/icons/help/help-50.png";
import Teach from "@/public/icons/teach/teach-50.png";
import Image from "next/image";


export default function SideArea() {
    return (
        <ScrollArea className="h-[calc(100vh-60px)]  overflow-scroll w-[18rem] rounded-md border">
            <div className="p-4">
                <div className="flex items-center justify-around [&>*]:mx-3">
                    <Image src={Help} alt="help" />
                    <span>Get Help</span>
                </div>
                <Separator className="my-2 border-spacing-1 border-b border-gray-200" />
                <div className="flex items-center justify-around [&>*]:mx-3">
                    <Image src={Teach} alt="help" />
                    <span>Help Someone</span>
                </div>
                <Separator className="my-2 border-spacing-1 border-b border-gray-200" />
                <div className="flex items-center justify-around [&>*]:mx-3">
                    <Image src={Calendar} alt="help" />
                    <span>Edit Availability</span>
                </div>
                <Separator className="my-2 border-spacing-1 border-b border-gray-200" />
            </div>
        </ScrollArea>
    )
}