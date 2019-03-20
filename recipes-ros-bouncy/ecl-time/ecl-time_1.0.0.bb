# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Timing utilities are very dependent on the system api provided for their use. 	This package provides a means for handling different timing models. Current support  	- posix rt : complete. 	- macosx : posix timers only, missing absolute timers. 	- win : none."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/bouncy/ecl_time/1.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f71e6b7824f3107cf0dbeb9185fd9c85"
SRC_URI[sha256sum] = "cda43664d14976cdbc448985b9f8d53b41ff0365404857224e046464ef177841"
S = "${WORKDIR}/ecl_core-release-release-bouncy-ecl_time-1.0.0-0"


inherit ros
inherit ament

