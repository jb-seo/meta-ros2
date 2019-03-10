# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Generate the ROS interfaces in C."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake-ros rosidl-parser rosidl-typesupport-interface"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_generator_c/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5411b548a817690d86e85cbc80c9b9ae"
SRC_URI[sha256sum] = "faf3e8c0b436926f12be1f2ae3190685d52e0fc6856aff7dc159bceb3456319c"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_generator_c-0.6.3-0"

inherit catkin
