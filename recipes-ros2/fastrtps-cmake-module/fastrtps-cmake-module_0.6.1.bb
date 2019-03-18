# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Provide CMake module to find eProsima FastRTPS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/rosidl_typesupport_fastrtps-release/archive/release/crystal/fastrtps_cmake_module/0.6.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d01b180d79765011a68850d372a952b1"
SRC_URI[sha256sum] = "f2a152b916a700341bd1fdb6c2730e06f094e773fac5b42b3706cabbaf79ae93"
S = "${WORKDIR}/rosidl_typesupport_fastrtps-release-release-crystal-fastrtps_cmake_module-0.6.1-0"

inherit ament
