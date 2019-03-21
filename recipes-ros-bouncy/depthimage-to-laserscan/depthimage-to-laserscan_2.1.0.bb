# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "image-geometry rclcpp sensor-msgs libopencv-dev"
SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/bouncy/depthimage_to_laserscan/2.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "404fab2cbe73411fc38e2d05b11bf413"
SRC_URI[sha256sum] = "909bf014f689eed98f1e790afa350f4f87ca2eecc1bc52763b24bac8374ef395"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-bouncy-depthimage_to_laserscan-2.1.0-0"

inherit ros
inherit ament


