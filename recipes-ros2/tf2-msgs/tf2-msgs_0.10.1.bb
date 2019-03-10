# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "tf2_msgs"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake builtin-interfaces geometry-msgs rosidl-default-generators rosidl-default-runtime"
SRC_URI = "https://github.com/ros2-gbp/geometry2-release/archive/release/crystal/tf2_msgs/0.10.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "277ddbf2bc5a0d64444ff2adc9d9e356"
SRC_URI[sha256sum] = "3229d3ac0f9001ee47e1de7be89d370382142ea81501c9ba8a4e27c20c342c9e"
S = "${WORKDIR}/geometry2-release-release-crystal-tf2_msgs-0.10.1-0"

inherit catkin
