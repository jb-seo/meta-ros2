# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Timing utilities are very dependent on the system api provided for their use. 	This package provides a means for handling different timing models. Current support  	- posix rt : complete. 	- macosx : posix timers only, missing absolute timers. 	- win : none."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake-ros ecl-build ecl-config ecl-errors ecl-exceptions ecl-license ecl-time-lite"
SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_time/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "13f49367d9597befc4213b1ebb9c307d"
SRC_URI[sha256sum] = "f9c643be05bfe53d52aa9aafe0bc5b41620cace6fea343bb68578334905d799c"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_time-1.0.1-0"

inherit catkin
