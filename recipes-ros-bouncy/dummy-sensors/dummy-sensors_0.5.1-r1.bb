# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "dummy sensor nodes"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "rclcpp sensor-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/bouncy/dummy_sensors/0.5.1-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "84118ed5b63754e9ed426e560d41014a"
SRC_URI[sha256sum] = "4f831ebe00fdd0d972377fe113a052cf19cd9850b1ecf6d1055ebd3128ddc8c2"
S = "${WORKDIR}/demos-release-release-bouncy-dummy_sensors-0.5.1-1"


inherit ros
inherit ament

