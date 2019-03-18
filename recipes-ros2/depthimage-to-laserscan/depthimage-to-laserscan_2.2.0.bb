# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "depthimage_to_laserscan"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " image-geometry libopencv-dev rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/depthimage_to_laserscan-release/archive/release/crystal/depthimage_to_laserscan/2.2.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c1206c91e82edd724407ec9b71d34ca5"
SRC_URI[sha256sum] = "5f47f24261ddcfafd27a8f7df499d150049acc85156653e7751ab8a2ded9bbdc"
S = "${WORKDIR}/depthimage_to_laserscan-release-release-crystal-depthimage_to_laserscan-2.2.0-0"

inherit ament
