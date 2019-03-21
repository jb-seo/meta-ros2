# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A package containing some stereo camera related message definitions."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rosidl-default-generators rosidl-default-runtime sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/common_interfaces-release/archive/release/bouncy/stereo_msgs/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "73b471c3549437afc6f4542133aa5190"
SRC_URI[sha256sum] = "03a56b325b3dcf18068bbcd9da2f841f3f587e51dc9d3e4879680efc53a87e46"
S = "${WORKDIR}/common_interfaces-release-release-bouncy-stereo_msgs-0.5.1-0"

inherit ros
inherit ament


