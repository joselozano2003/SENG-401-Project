"use client";

import { TypeAnimation } from "react-type-animation";

export default function MovingText() {
    return (
        <TypeAnimation 
                sequence={[
                    'Find a Tutor',
                    1500,
                    'Become a Tutor',
                    1500,
                  ]}
                speed={50}
                className=" "
                repeat={Infinity}
        />
    )
}