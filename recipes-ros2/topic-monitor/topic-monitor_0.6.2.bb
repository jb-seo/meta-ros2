# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Package containing tools for monitoring ROS 2 topics."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "launch launch-ros rclpy std-msgs"
SRC_URI = "https://github.com/ros2-gbp/demos-release/archive/release/crystal/topic_monitor/0.6.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "02e9fa940c13f8bac55cf177c5be3d8f"
SRC_URI[sha256sum] = "6cad0a1877a05bd2e7e7888f06f26f4739e442726da85a548f4ddb65783ead6c"
S = "${WORKDIR}/demos-release-release-crystal-topic_monitor-0.6.2-0"

inherit ament
