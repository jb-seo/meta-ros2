# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The topic command for ROS 2 command line tools."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclpy ros2cli ros2msg python3-pyyaml"
SRC_URI = "https://github.com/ros2-gbp/ros2cli-release/archive/release/bouncy/${PN}/0.5.4-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c888649ce59add7f0f739935adcaec42"
SRC_URI[sha256sum] = "0d74558675dfb3c7217a8b9aa58ea28a86d23dae4f7d160aba8c0f719a09d7e8"
S = "${WORKDIR}/ros2cli-release-release-bouncy-${PN}-0.5.4-0"

inherit ros
inherit setuptools3


