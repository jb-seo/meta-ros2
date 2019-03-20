# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find eProsima FastRTPS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rmw_fastrtps-release/archive/release/bouncy/fastrtps_cmake_module/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d736000593551c22d0b48f3506289c40"
SRC_URI[sha256sum] = "2c5d40f8e14e4ed2193bf584e3d5569b5a8dacc8373283cc414b994416be74c6"
S = "${WORKDIR}/rmw_fastrtps-release-release-bouncy-fastrtps_cmake_module-0.5.1-0"


inherit ros
inherit ament

