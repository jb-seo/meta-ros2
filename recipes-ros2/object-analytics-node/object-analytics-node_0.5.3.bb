# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The object_analytics_node package"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=a530e7e8bd0b9c8e6d4e5d32904af192"

DEPENDS = "   class-loader cv-bridge geometry-msgs libpcl-all libpcl-all-dev message-filters object-analytics-msgs object-msgs pcl-conversions rclcpp sensor-msgs std-msgs"
SRC_URI = "https://github.com/ros2-gbp/ros2_object_analytics-release/archive/release/crystal/object_analytics_node/0.5.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "a1ba2590ba4360d2b24650dc26eeaa7b"
SRC_URI[sha256sum] = "8028765babd1011acd8ee4ad27dd07903d43f482e862920544ba212be7186c80"
S = "${WORKDIR}/ros2_object_analytics-release-release-crystal-object_analytics_node-0.5.3-0"

inherit ament
