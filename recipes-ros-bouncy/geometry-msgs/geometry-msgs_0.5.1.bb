# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some geometry related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-default-generators rosidl-default-runtime std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/geometry_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "46caa2205af40da26b56946d5f8632c4"
SRC_URI[sha256sum] = "339ab41840dc4dbb022540978613152001f4e0c4c0bd7b959d1726f453f7b29e"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-geometry_msgs-0.5.1-0"

inherit ros
inherit ament


