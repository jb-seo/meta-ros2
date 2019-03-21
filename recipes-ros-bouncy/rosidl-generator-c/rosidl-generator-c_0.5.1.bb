# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in C."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-parser rosidl-typesupport-interface"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/bouncy/rosidl_generator_c/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "59a06a9cf202a236716ed9becd1d5250"
SRC_URI[sha256sum] = "374f0932f515304a109467a192cb9ab7172effe4ed3b8e3b8f50dcbc413fc94f"
S = "${WORKDIR}/rosidl-release-release-bouncy-rosidl_generator_c-0.5.1-0"

inherit ros
inherit ament


