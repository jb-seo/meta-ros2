# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Display object analytics result in rviz"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = "ament-cmake cv-bridge geometry-msgs message-filters object-analytics-msgs object-msgs rclcpp sensor-msgs std-msgs visualization-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/crystal/object_analytics_rviz/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "1feb8d8e21b0c218aed850297cfa24f9"
SRC_URI[sha256sum] = "00f9f160d4740e7ca9799da65b83e5337aa482e4dac4cc151ce8c84deafcb65b"
S = "${WORKDIR}/ros2_object_analytics-release-release-crystal-object_analytics_rviz-0.5.3-0"

inherit catkin
