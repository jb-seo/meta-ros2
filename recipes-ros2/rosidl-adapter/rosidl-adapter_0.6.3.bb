# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "API and scripts to parse .msg/.srv/.action files and convert them to .idl."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake python3-empy"
SRC_URI = "https://github.com/ros2-gbp/rosidl-release/archive/release/crystal/rosidl_adapter/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2b9cbda22354de0e274c0b1408451747"
SRC_URI[sha256sum] = "79a9668a51ee594d5e7a3d6d38d25ee20dfefde53e4ce49cd7d7a665e9105801"
S = "${WORKDIR}/rosidl-release-release-crystal-rosidl_adapter-0.6.3-0"

inherit catkin
