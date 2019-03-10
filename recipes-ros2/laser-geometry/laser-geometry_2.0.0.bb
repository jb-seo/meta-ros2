# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "This package contains a class for converting from a 2D laser scan as defined by     sensor_msgs/LaserScan into a point cloud as defined by sensor_msgs/PointCloud     or sensor_msgs/PointCloud2. In particular, it contains functionality to account     for the skew resulting from moving robots or tilting laser scanners."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake eigen rclcpp sensor-msgs tf2"
SRC_URI = "https://github.com/ros2-gbp/laser_geometry-release/archive/release/crystal/laser_geometry/2.0.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "f99d2b8a3067671a46b1de5f1ac029be"
SRC_URI[sha256sum] = "7eebd7deb07fcd802f465ded75470b19331e11795f26069a2d8ce438a316ff70"
S = "${WORKDIR}/laser_geometry-release-release-crystal-laser_geometry-2.0.0-0"

inherit catkin
